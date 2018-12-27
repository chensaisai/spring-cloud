package com.ys.springcloud;

import com.ys.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author: saisai
 * @Date: 2018/11/21 16:07
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-BMS" ,configuration = MySelfRule.class)
public class BmsConsumer80_App {


    public static void main(String[] args) {

        SpringApplication.run(BmsConsumer80_App.class, args);
    }
}
