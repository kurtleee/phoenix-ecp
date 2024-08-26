package com.uniview.customer;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Kurt LEE
 * @created 2024/08/26 - 上午11:21
 */
@SpringBootApplication
@MapperScan("com.uniview.customer.mapper")
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}