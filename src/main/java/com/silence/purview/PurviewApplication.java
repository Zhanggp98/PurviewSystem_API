package com.silence.purview;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@MapperScan(basePackages = "com.silence.purview.mapper")
public class PurviewApplication {

    public static void main(String[] args) {
        SpringApplication.run(PurviewApplication.class, args);
    }

}
