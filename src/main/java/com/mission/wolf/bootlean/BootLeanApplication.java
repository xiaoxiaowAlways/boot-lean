package com.mission.wolf.bootlean;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = {"com.mission.wolf.bootlean.mapper"})
@EnableCaching
@EnableRabbit
public class BootLeanApplication {

  public static void main(String[] args) {
    SpringApplication.run(BootLeanApplication.class, args);
  }
}
