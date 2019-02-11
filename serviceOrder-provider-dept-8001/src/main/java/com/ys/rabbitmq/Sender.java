package com.ys.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: saisai
 * @Date: 2019/1/16 17:07
 */
@Component
public class Sender {


    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){

        String content = "Hello rabbitMq" + new Date();
        System.out.println("第一个rabbitMq消息中间件实现："+content);
        this.amqpTemplate.convertAndSend("hello",content);
    }
}
