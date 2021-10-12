package com.chilx.jw.controller;

import com.chilx.jw.common.base.ResultData;
import com.chilx.jw.entity.sys.SysDictTypeEntity;
import com.chilx.jw.repository.sys.DictTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chilx
 * @date 2021/10/12
 **/
@RestController
@RequestMapping("/dict")
public class DictController {


    @Autowired
    DictTypeRepository repository;


    @GetMapping("/type/detail/{id}")
    public ResultData dictDetail(@PathVariable("id") Integer id) {
        SysDictTypeEntity dictType = repository.getById(id);
        return ResultData.ok(dictType);
    }

}
