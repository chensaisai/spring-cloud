package com.ys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author: saisai
 * @Date: 2018/12/28 17:05
 */
@SpringBootApplication
@EnableHystrixDashboard
public class BmsConsumerHystrixDashboard {

    public static void main(String[] args) {
        SpringApplication.run(BmsConsumerHystrixDashboard.class, args);
    }
}
