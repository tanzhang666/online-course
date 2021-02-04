package com.learn.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SystemMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(SystemMain9001.class,args);
    }
}
