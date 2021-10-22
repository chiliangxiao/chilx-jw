package com.chilx.jw.common.base.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 实体基类 所有新增的实体必须继承该类
 *
 * @author chilx
 * @date 2020/10/28
 **/
@Data
@MappedSuperclass
public class BaseEntity implements BaseEntityField, Serializable {

    private static final long serialVersionUID = 973809353044157843L;
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 创建时间
     */
    @Column(name = "create_time", updatable = false, nullable = false)
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "create_user", updatable = false, nullable = false)
    private Integer createUser;

    /**
     * 修改时间
     */
    @Column(name = "update_time", nullable = false)
    private Date updateTime;

    /**
     * 修改人
     */
    @Column(name = "update_user", nullable = false)
    private Integer updateUser;

    /**
     * 是否删除: 0-否, 1-是
     */
    @Column(name = "is_del", length = 1, columnDefinition = "bit default 0")
    private Boolean delete;


}
