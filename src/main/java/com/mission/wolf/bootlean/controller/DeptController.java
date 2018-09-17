package com.mission.wolf.bootlean.controller;

import com.mission.wolf.bootlean.entities.Dept;
import com.mission.wolf.bootlean.repository.DeptRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Captain Wolf
 * 2018/9/17 22:04
 */
@RestController
@RequestMapping("/dept")
@AllArgsConstructor
public class DeptController {

  private DeptRepository deptRepository;

  @RequestMapping("/{id}")
  public Dept getById(@PathVariable("id") int id) {
    return deptRepository.getById(id);
  }

}
