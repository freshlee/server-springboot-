package com.example.demo.test;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Rabbit {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    @GetMapping("")
    public String test () {
        this.rabbitTemplate.convertAndSend("offer",  "发送时间");
//        for(int i = 0; i< 2000; i++){
//            test temp = new test();
//            temp.setRabbitTemplate(rabbitTemplate);
//            temp.setNum(i+"队列");
//            temp.start();
//        }
        return "hehe";
    }
}

