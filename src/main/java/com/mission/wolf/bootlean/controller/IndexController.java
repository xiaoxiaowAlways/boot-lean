package com.mission.wolf.bootlean.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Captain Wolf
 * 2018/8/22 16:55
 */
@RestController
@RequestMapping("/index")
public class IndexController {
  @RequestMapping("/index")
  public String index() {

    return "ok";
  }
}
