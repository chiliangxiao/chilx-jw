package com.chilx.jw.common.base.entity;


import com.chilx.jw.config.jpacomment.Comment;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

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
@EntityListeners(AuditingEntityListener.class)
@DynamicInsert
@DynamicUpdate
public class BaseEntity implements BaseEntityField, Serializable {

    private static final long serialVersionUID = 973809353044157843L;
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment(value = "主键")
    private Integer id;

    /**
     * 创建时间
     */
    @Column(name = "create_time", updatable = false, nullable = false)
    @CreatedDate
    @Comment(value = "创建时间")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "create_user", updatable = false, nullable = false)
    @CreatedBy
    @Comment(value = "创建人")
    private Integer createUser;

    /**
     * 修改时间
     */
    @Column(name = "update_time", nullable = false)
    @LastModifiedDate
    @Comment(value = "修改时间")
    private Date updateTime;

    /**
     * 修改人
     */
    @Column(name = "update_user", nullable = false)
    @LastModifiedBy
    @Comment(value = "修改人")
    private Integer updateUser;

    /**
     * 是否删除: 0-否, 1-是
     */
    @Column(name = "is_del", length = 1, columnDefinition = "bit default 0")
    @Comment(value = "是否删除(0-否, 1-是)")
    private Boolean delete;


}
