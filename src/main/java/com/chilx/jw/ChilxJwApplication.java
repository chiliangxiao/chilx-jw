package com.chilx.jw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.chilx.jw.dao")
public class ChilxJwApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChilxJwApplication.class, args);
    }

}
