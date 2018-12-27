package com.ys.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: saisai
 * @Date: 2018/11/21 16:20
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){

        return new RandomRule_ZY();
    }
}
