package com.ys.springcloud.rabbit;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author: saisai
 * @Date: 2019/1/17 16:22
 */
@Component
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(value = "${mq.config.queue.info}",autoDelete = "true"),
                exchange = @Exchange(value = "${mq.config.exchange}",type = ExchangeTypes.TOPIC),
                        key="*.log.info"
        )
)
public class InfoReceiveClient {


    /**
     * 接收消息的方法，采用消息队列监听机制
     * @param msg
     */
    @RabbitHandler
    public void process(String msg){

        System.out.println("-------接收到log.info的日志信息啦------------"+msg);
    }
}
