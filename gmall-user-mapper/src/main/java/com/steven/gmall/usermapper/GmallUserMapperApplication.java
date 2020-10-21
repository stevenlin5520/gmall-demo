package com.steven.gmall.usermapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.steven.gmall.usermapper.mapper")
public class GmallUserMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserMapperApplication.class, args);
    }

}
