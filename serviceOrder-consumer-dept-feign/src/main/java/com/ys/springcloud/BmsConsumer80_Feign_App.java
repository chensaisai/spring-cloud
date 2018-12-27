package com.ys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: saisai
 * @Date: 2018/11/21 16:07
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "MICROSERVICECLOUD-BMS" ,configuration = MySelfRule.class)
@EnableFeignClients(basePackages = {"com.ys"})
@ComponentScan(basePackages = "com.ys")
public class BmsConsumer80_Feign_App {

    public static void main(String[] args) {

        SpringApplication.run(BmsConsumer80_Feign_App.class, args);
    }
}
