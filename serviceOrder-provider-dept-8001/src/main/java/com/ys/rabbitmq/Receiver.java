package com.ys.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: saisai
 * @Date: 2019/1/16 17:20
 */
@Component
public class Receiver {

    @RabbitListener(queues = "hello")
    public void process(String hello){

        System.out.println("Receiver:" + hello);

    }
}
