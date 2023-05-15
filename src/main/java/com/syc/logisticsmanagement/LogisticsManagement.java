package com.syc.logisticsmanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.syc.logisticsmanagement.mapper")
public class LogisticsManagement {

    public static void main(String[] args) {
        SpringApplication.run(LogisticsManagement.class, args);
    }

}

