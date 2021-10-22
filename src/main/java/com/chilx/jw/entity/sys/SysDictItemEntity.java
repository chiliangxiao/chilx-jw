package com.chilx.jw.entity.sys;

import com.chilx.jw.common.base.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 字典数据
 *
 * @author chilx
 * @date 2021/10/11
 **/
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "sys_dict_item")
@Data
public class SysDictItemEntity extends BaseEntity {

    @Column(name = "item_name", length = 64, nullable = false)
    private String itemName;


    @Column(name = "item_value", length = 128, nullable = false)
    private String itemValue;


    @Column(name = "dict_code", length = 64, nullable = false)
    private String dictCode;

    @Column(name = "is_default", length = 1, columnDefinition = "bit default 0")
    private Boolean isDefault;

    @Column(name = "is_enable", length = 1, columnDefinition = "bit default 1")
    private Boolean enable;


    @Column(name = "sort_val", length = 100, columnDefinition = "int default 1")
    private Integer sortVal;

    @Column(name = "remark", length = 256)
    private Integer remark;

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
