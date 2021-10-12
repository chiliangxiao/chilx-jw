package com.chilx.jw.common.base.entity;

/**
 * 实体基类 字段常量
 *
 * @author chilx
 * @date 2021/3/4
 **/
public interface BaseEntityField {
    /**
     * 主键Id
     */
    String ID = "id";
    /**
     * 创建时间
     */
    String CREATE_TIME = "createTime";
    /**
     * 创建用户
     */
    String CREATE_USER = "createUser";
    /**
     * 修改时间
     */
    String UPDATE_TIME = "updateTime";
    /**
     * 修改用户
     */
    String UPDATE_USER = "updateUser";
    /**
     * 是否删除
     */
    String IS_DEL = "delete";
}