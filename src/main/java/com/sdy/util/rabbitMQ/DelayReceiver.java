package com.sdy.util.rabbitMQ;

import java.util.Date;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.sdy.model.User;

@Component
@RabbitListener(queues = "DelayQueue")
public class DelayReceiver {

    @RabbitHandler
    public void process(String hello) {
    	System.out.println("DelayReceiver.process:"+new Date().getTime());
    }
}
