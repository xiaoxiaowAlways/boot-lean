package com.mission.wolf.bootlean.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Captain Wolf
 * 2018/9/9 14:44
 */
public class HelloApplicationContextInitializer implements ApplicationContextInitializer {
  @Override
  public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
    System.out.println("ApplicationContextInitializer...initialize...");
  }
}
