package com.mission.wolf.bootlean.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Captain Wolf
 * 2018/9/9 14:49
 */
@Component
public class HelloCommandLineRunner implements CommandLineRunner {
  @Override
  public void run(String... args) throws Exception {
    System.out.println("CommandLineRunner...run..." + Arrays.asList(args));
  }
}
