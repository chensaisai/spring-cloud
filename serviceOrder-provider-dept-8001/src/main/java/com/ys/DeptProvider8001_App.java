package com.ys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: saisai
 * @Date: 2018/11/19 17:15
 */
@SpringBootApplication
@EnableEurekaClient//本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient//启用服务发现
@EnableSwagger2
@EnableCircuitBreaker
public class DeptProvider8001_App {


    public static void main(String[] args) {

        SpringApplication.run(DeptProvider8001_App.class, args);

    }
}