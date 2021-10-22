package com.chilx.jw.entity.sys;

import com.chilx.jw.common.base.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
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
@Data
public class SysDictTypeEntity extends BaseEntity {

    @Column(name = "dict_name", length = 64, nullable = false)
    @NotNull(message = "名称不能为空")
    private String dictName;

    @Column(name = "dict_code", length = 64, nullable = false)
    @NotNull(message = "code不能为空")
    private String dictCode;

    @Column(name = "is_enable", length = 1, columnDefinition = "bit default 1")
    private Boolean enable;

    @Column(name = "sort_val", length = 100, columnDefinition = "int default 0")
    private Integer sortVal;

    @Column(name = "remark", length = 256)
    private Integer remark;

}
