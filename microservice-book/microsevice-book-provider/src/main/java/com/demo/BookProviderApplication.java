package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableEurekaClient
//扫描该项和引入的jar包
@SpringBootApplication(scanBasePackages = {"com.demo"})
//扫描的是对外接口所在的包
@EnableFeignClients(basePackages = {"com.demo"})
//@ComponentScan({"com.demo.service","com.demo"})
@EnableDiscoveryClient
public class BookProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookProviderApplication.class,args);
    }
}
