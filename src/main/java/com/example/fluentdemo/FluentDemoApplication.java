package com.example.fluentdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.example.fluentdemo.mapper"})
public class FluentDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FluentDemoApplication.class, args);
    }

}
