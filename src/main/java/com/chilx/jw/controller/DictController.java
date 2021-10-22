package com.chilx.jw.controller;

import com.chilx.jw.common.base.ResultData;
import com.chilx.jw.dao.sys.DictItemMapper;
import com.chilx.jw.entity.sys.SysDictItemEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chilx
 * @date 2021/10/12
 **/
@RestController
@RequestMapping("/dict")
public class DictController {
    @Resource
    DictItemMapper dictItemMapper;

    @GetMapping("/type/detail/{id}")
    public ResultData dictDetail(@PathVariable("id") Integer id) {

        SysDictItemEntity sysDictItemEntity = dictItemMapper.selectByPrimaryKey(1);

        return ResultData.ok(sysDictItemEntity);
    }

}
