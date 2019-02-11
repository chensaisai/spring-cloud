package com.ys;

import com.ys.rabbitmq.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: saisai
 * @Date: 2019/1/17 11:33
 */
@SpringBootTest(classes = DeptProvider8001_App.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RabbitTest {


    @Autowired
    private Sender sender;

    @Test
    public void rabbitTest(){

        while (true){
            sender.send();
            System.out.println("第一个Rabbit Mq 消息中间件发送消息成功");
        }

    }
}
