package com.chilx.jw.entity.sys;

import com.chilx.jw.common.base.entity.BaseEntity;
import com.chilx.jw.config.jpacomment.Comment;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 字典类型
 *
 * @author chilx
 * @date 2021/10/11
 **/
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "sys_dict_type")
@Comment(value = "字典类型表")
@Data
@DynamicInsert
@DynamicUpdate
public class SysDictTypeEntity extends BaseEntity {

    @Column(name = "dict_name", length = 64, nullable = false)
    @Comment(value = "字典名称")
    @NotNull(message = "名称不能为空")
    private String dictName;

    @Column(name = "dict_code", length = 64, nullable = false)
    @Comment(value = "字典code")
    @NotNull(message = "code不能为空")
    private String dictCode;

    @Column(name = "is_enable", length = 1, columnDefinition = "bit default 1")
    @Comment("是否启用(0-否, 1-是)")
    private Boolean enable;

    @Column(name = "sort_val", length = 100, columnDefinition = "int default 0")
    @Comment("排序值 值越大越靠前")
    private Integer sortVal;

    @Column(name = "remark", length = 256)
    @Comment("备注")
    private Integer remark;

}
