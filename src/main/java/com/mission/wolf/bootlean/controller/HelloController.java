package com.mission.wolf.bootlean.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author Captain Wolf
 * 2018/9/9 12:14
 */
@RestController
public class HelloController {
  @Autowired
  JdbcTemplate jdbcTemplate;


  @RequestMapping("/")
  public Map<String, Object> getById() {
    String sql = "select * from dept";
    List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
    return maps.get(0);
  }

}
