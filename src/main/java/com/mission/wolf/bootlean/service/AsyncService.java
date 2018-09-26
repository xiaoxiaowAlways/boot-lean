package com.mission.wolf.bootlean.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author Captain Wolf
 * 2018/9/26 21:42
 */
@Service
public class AsyncService {

  @Async
  public void hello(){
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("数据处理中。。。");
  }
}
