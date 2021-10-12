package com.chilx.jw;

import com.chilx.jw.entity.sys.SysDictTypeEntity;
import com.chilx.jw.repository.sys.DictTypeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@SpringBootTest
class ChilxJwApplicationTests {

    @Autowired
    DictTypeRepository repository;

    @Test
    @Transactional
    void contextLoads() {

        SysDictTypeEntity dictionaryEntry = new SysDictTypeEntity();




        dictionaryEntry.setCreateTime(new Date());
        dictionaryEntry.setCreateUser(1);
        dictionaryEntry.setUpdateTime(new Date());
        dictionaryEntry.setUpdateUser(1);
        dictionaryEntry.setDelete(false);
        dictionaryEntry.setEnable(true);
        repository.save(dictionaryEntry);


    }

}
