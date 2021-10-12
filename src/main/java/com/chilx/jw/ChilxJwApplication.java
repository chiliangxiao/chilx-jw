package com.chilx.jw;

import com.chilx.jw.entity.sys.SysDictTypeEntity;
import com.chilx.jw.repository.sys.DictTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChilxJwApplication {

    @Autowired
    DictTypeRepository repository;


    public static void main(String[] args) {
        SpringApplication.run(ChilxJwApplication.class, args);

        SysDictTypeEntity dictionaryEntry = new SysDictTypeEntity();



//        dictionaryEntry.setTypeName("1232");
//        dictionaryEntry.setTypeCode("2432");
//        dictionaryEntry.setCreateTime(new Date());
//        dictionaryEntry.setCreateUser(1);
//        dictionaryEntry.setUpdateTime(new Date());
//        dictionaryEntry.setUpdateUser(1);
////        dictionaryEntry.setDelete(false);
////        dictionaryEntry.setEnable(true);
//        ApplicationContextHelper.getBean(DictTypeRepository.class).save(dictionaryEntry);
    }

}
