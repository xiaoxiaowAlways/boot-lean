package com.mission.wolf.bootlean.controller;

import com.mission.wolf.bootlean.excaption.NoLoginException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Captain Wolf
 * 2018/9/20 21:13
 */
@RestController
@RequestMapping("/login")
public class LoginController {
  @RequestMapping("/login")
  public String login(String name) {

    return "OK";
  }

}
