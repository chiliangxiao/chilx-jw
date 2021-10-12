package com.chilx.jw.common.base;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.Collection;
import java.util.Collections;

/**
 * 分页对象
 *
 * @author chilx
 * @date 2021/3/5
 **/
@Data
public class PageInfo<T> {

    /**
     * 数据
     */
    private Collection<T> content;
    /**
     * 总条数
     */
    private int total;

    /**
     * 总页数
     */
    private int totalPages;
    /**
     * 条数
     */
    private int pageSize;

    /**
     * 页数
     */
    private int pageNum;

    /**
     * 是否有数据
     */
    private boolean hasContent;

    /**
     * 第一页
     */
    private boolean first;

    /**
     * 最后一页
     */
    private boolean last;


    /**
     * 是否有下一页
     */
    private boolean hasNext;

    /**
     * 是否有上一页
     */
    private boolean hasPrev;

    public PageInfo() {
        this.hasContent = false;
        this.total = 0;
        this.content = Collections.emptyList();
    }

    public PageInfo(Collection<T> content, Integer total, Integer pageNum, Integer pageSize) {
        this.content = content;
        this.total = total;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        int totalPage = (total / pageSize) + 1;
        this.hasNext = (totalPage > pageNum);
        this.hasPrev = (pageNum > 1);
        this.hasContent = content.isEmpty();
        this.totalPages = totalPage;
        this.first = pageNum == 1;
        this.last = pageNum == totalPage;
    }


    public PageInfo(Page<T> page) {
        this.content = page.getContent();
        this.last = page.isLast();
        this.first = page.isFirst();
        this.pageNum = page.getNumber() + 1;
        this.pageSize = page.getSize();
        this.hasNext = page.hasNext();
        this.hasPrev = page.hasPrevious();
        this.total = (int) page.getTotalElements();
        this.totalPages = page.getTotalPages();
        this.hasContent = page.hasContent();

    }

    /**
     * 构建分页
     *
     * @param page JPA 原始分页对象
     * @param <T>  数据
     * @return 新的分页对象
     */
    public static <T> PageInfo<T> convert(Page<T> page) {
        PageInfo<T> pageInfo = new PageInfo<>();
        pageInfo.setContent(page.getContent());
        pageInfo.setLast(page.isLast());
        pageInfo.setFirst(page.isFirst());
        pageInfo.setPageNum(page.getNumber() + 1);
        pageInfo.setPageSize(page.getSize());
        pageInfo.setHasNext(page.hasNext());
        pageInfo.setHasPrev(page.hasPrevious());
        pageInfo.setTotal((int) page.getTotalElements());
        pageInfo.setTotalPages(page.getTotalPages());
        pageInfo.setHasContent(page.hasContent());
        return pageInfo;

    }


    /**
     * 构建分页
     *
     * @param content  数据集合
     * @param total    总条数
     * @param pageNum  页码
     * @param pageSize 条数
     * @return 分页对象
     */
    public static <T> PageInfo<T> convert(Collection<T> content, int total, int pageNum, int pageSize) {
        PageInfo<T> pageInfo = new PageInfo<>();
        int totalPage = (total / pageSize) + 1;
        pageInfo.setContent(content);
        pageInfo.setPageNum(pageNum);
        pageInfo.setPageSize(pageSize);
        pageInfo.setHasNext(totalPage > pageNum);
        pageInfo.setHasPrev(pageNum > 1);
        pageInfo.setHasContent(content.isEmpty());
        pageInfo.setTotal(total);
        pageInfo.setTotalPages(totalPage);
        pageInfo.setLast(pageNum == totalPage);
        pageInfo.setFirst(pageNum == 1);
        return pageInfo;
    }
}
