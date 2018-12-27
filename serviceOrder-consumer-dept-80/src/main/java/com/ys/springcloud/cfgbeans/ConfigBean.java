package com.ys.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: saisai
 * @Date: 2018/11/21 16:05
 */
@Configuration
public class ConfigBean {  //boot  --->  spring   application.xml  ----@Configuration   configuration = application.xml

    @Bean
    @LoadBalanced  //spring cloud ribbon 是基于 Netflix  Ribbon 实现的一套客户端   负载均衡工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){

        return new RetryRule();
    }
}
