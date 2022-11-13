package com.example.vueparentss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.vueparentss.dao")
@SpringBootApplication
public class VueParentssApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueParentssApplication.class, args);
    }

}
