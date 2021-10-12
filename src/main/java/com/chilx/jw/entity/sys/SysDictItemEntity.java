package com.chilx.jw.entity.sys;

import com.chilx.jw.common.base.entity.BaseEntity;
import com.chilx.jw.config.jpacomment.Comment;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 字典数据
 *
 * @author chilx
 * @date 2021/10/11
 **/
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "sys_dict_item")
@Comment(value = "字典数据表")
@Data
@DynamicInsert
@DynamicUpdate
public class SysDictItemEntity extends BaseEntity {

    @Column(name = "item_name", length = 64, nullable = false)
    @Comment(value = "字典名称")
    private String itemName;


    @Column(name = "item_value", length = 128, nullable = false)
    @Comment(value = "字典标签值")
    private String itemValue;


    @Column(name = "dict_code", length = 64, nullable = false)
    @Comment(value = "字典code")
    private String dictCode;

    @Column(name = "is_default", length = 1, columnDefinition = "bit default 0")
    @Comment("是否默认(0-否,1-是)")
    private Boolean isDefault;

    @Column(name = "is_enable", length = 1, columnDefinition = "bit default 1")
    @Comment("0=启动,1=停用")
    private Boolean enable;


    @Column(name = "sort_val", length = 100, columnDefinition = "int default 1")
    @Comment("排序值")
    private Integer sortVal;

    @Column(name = "remark", length = 256)
    @Comment("备注")
    private Integer remark;

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
