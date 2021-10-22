package com.chilx.jw.common.base.service;

import com.chilx.jw.common.base.mybatis.BaseInfoMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * service 基类
 *
 * @author chilx
 * @date 2020年11月03日
 */
public class BaseServiceImpl<M extends BaseInfoMapper<T>, T>  implements BaseService<T>{

    @Autowired
    @SuppressWarnings("all")
    protected M mapper;

    @Override
    public T selectOne(T entity) {
        return mapper.selectOne(entity);
    }

    @Override
    public T selectById(Object id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<T> selectList(T entity) {
        return mapper.select(entity);
    }

    @Override
    public List<T> selectListAll() {
        return mapper.selectAll();
    }


    @Override
    public Long selectCount(T entity) {
        return (long) mapper.selectCount(entity);
    }

    @Override
    public void insert(T entity) {
        mapper.insert(entity);
    }

    @Override
    public void insertSelective(T entity) {
        mapper.insertSelective(entity);
    }

    @Override
    public int delete(T entity) {
        return mapper.delete(entity);
    }

    @Override
    public int deleteById(Object id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateById(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    @Override
    public int updateSelectiveById(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

    @Override
    public int selectCountByExample(Object example) {
        return mapper.selectCountByExample(example);
    }

    @Override
    public T selectOneByExample(Object example) {
        return mapper.selectOneByExample(example);
    }

    @Override
    public int deleteByExampleMapper(Object example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int updateByExampleMapper(T entity, Object example) {
        return mapper.updateByExample(entity, example);
    }

    @Override
    public int updateByExampleSelectiveMapper(T entity, Object example) {
        return mapper.updateByExampleSelective(entity, example);
    }

    @Override
    public int insertList(List<T> recordList) {
        return mapper.insertList(recordList);
    }

    @Override
    public List<T> selectBaseByIds(String ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public int deleteBaseByIds(String ids) {
        return mapper.deleteByIds(ids);
    }


    /**
     * 简单分页查询
     */
    @Override
    public PageInfo<T> page(Integer pageNum, Integer pageSize, T queryEntity) {
        // 分页开始
        PageHelper.startPage(pageNum, pageSize);
        List<T> list = mapper.select(queryEntity);
        return new PageInfo<>(list);
    }

    /**
     * 根据对象删除
     */
    @Override
    public int deleteByExample(Object example) {
        return mapper.deleteByExample(example);
    }
}
