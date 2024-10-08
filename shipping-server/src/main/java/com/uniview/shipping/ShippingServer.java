package com.uniview.shipping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Kurt LEE
 * @created 2024/08/26 - 上午11:22
 */
@SpringBootApplication
@MapperScan("com.uniview.shipping.mapper")
public class ShippingServer {
    public static void main(String[] args) {
        SpringApplication.run(ShippingServer.class, args);
    }
}