package com.mission.wolf.bootlean.service;

import com.mission.wolf.bootlean.entities.Dept;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author Captain Wolf
 * 2018/9/24 22:43
 */
@Slf4j
@Service
public class RabbitMQDeptService {

  @RabbitListener(queues = "wolf.news")
  public void receive(Dept dept) {
    log.info(dept.toString());
  }

  @RabbitListener(queues = "wolf")
  public void receiveMessage(Message message) {
    log.info(message.getBody().toString());
    log.info(message.getMessageProperties().toString());
  }
}
