package com.learn.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaServer7001Main {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EurekaServer7001Main.class);
        ConfigurableEnvironment ev = app.run(args).getEnvironment();
        log.info("========启动成功===========");
        log.info("Eureka注册中心地址：\t eureka7001.com:"+ev.getProperty("server.port"));
    }

}
