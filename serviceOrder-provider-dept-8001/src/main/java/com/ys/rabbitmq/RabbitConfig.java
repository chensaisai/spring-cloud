package com.ys.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: saisai
 * @Date: 2019/1/16 17:15
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue(){

        return new Queue("hello");
    }
}
