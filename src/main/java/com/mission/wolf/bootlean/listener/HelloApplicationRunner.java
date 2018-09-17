package com.mission.wolf.bootlean.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author Captain Wolf
 * 2018/9/9 14:48
 */
@Component
public class HelloApplicationRunner implements ApplicationRunner {
  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println("ApplicationRunner...run...");
  }
}
