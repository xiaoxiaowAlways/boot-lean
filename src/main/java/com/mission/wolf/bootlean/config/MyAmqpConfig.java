package com.mission.wolf.bootlean.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Captain Wolf
 * 2018/9/24 22:11
 */
@Configuration
public class MyAmqpConfig {
  /**
   * 设置自己的messageConverter 使其序列化成json
   * @return
   */
  @Bean
  public MessageConverter messageConverter() {
    return new Jackson2JsonMessageConverter();
  }
}
