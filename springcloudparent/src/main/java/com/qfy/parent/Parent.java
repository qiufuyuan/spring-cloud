package com.qfy.parent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Parent {
    public static void main(String[] args) {
        SpringApplication.run(Parent.class,args);
    }
}
