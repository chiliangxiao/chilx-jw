package com.chilx.jw.common.base.service;


import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author chilx
 * @date 2021/10/18
 **/
public interface BaseService<T> {
    /**
     * 查询
     *
     * @param entity 实体参数
     * @return 实体
     */
    T selectOne(T entity);

    /**
     * 通过Id查询
     *
     * @param id 主键
     * @return 实体
     */
    T selectById(Object id);


    /**
     * 查询列表
     *
     * @param entity 实体参数
     * @return 实体集合
     */
    List<T> selectList(T entity);

    /**
     * 获取所有对象
     *
     * @return 所有实体集合
     */
    List<T> selectListAll();


    /**
     * 查询总记录数
     *
     * @param entity 实体参数
     * @return 总数
     */
    Long selectCount(T entity);

    /**
     * 添加
     *
     * @param entity 实体参数
     */
    void insert(T entity);

    /**
     * 插入 不插入null字段
     *
     * @param entity 实体参数
     */
    void insertSelective(T entity);

    /**
     * 删除
     *
     * @param entity 实体参数
     */
    int delete(T entity);

    /**
     * 根据Id删除
     *
     * @param id 主键
     */
    int deleteById(Object id);

    /**
     * 通过对象删除
     *
     * @param example 参数
     */
    int deleteByExample(Object example);

    /**
     * 根据id更新
     *
     * @param entity 实体参数
     */
    int updateById(T entity);

    /**
     * 不update null
     *
     * @param entity 实体参数
     */
    int updateSelectiveById(T entity);

    List<T> selectByExample(Object example);

    int selectCountByExample(Object example);

    T selectOneByExample(Object example);

    int deleteByExampleMapper(Object example);

    int updateByExampleMapper(T entity, Object example);

    int updateByExampleSelectiveMapper(T entity, Object example);

    int insertList(List<T> recordList);

    List<T> selectBaseByIds(String ids);

    int deleteBaseByIds(String ids);

    /**
     * 简单分页查询
     */
    PageInfo<T> page(Integer pageNum, Integer pageSize, T queryEntity);
}
