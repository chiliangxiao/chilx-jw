package com.chilx.jw.common.base.mybatis;

import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author chilx
 * @date 2021/10/18
 **/
public interface BaseInfoMapper<T> extends Mapper<T>, InsertListMapper<T>, IdsMapper<T>, ConditionMapper<T> {
    // 特别注意，该接口不能被扫描到，否则会出错
}
