package com.mission.wolf.bootlean.entities;

import io.searchbox.annotations.JestId;
import lombok.ToString;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@ToString
@Document(indexName = "xiaoxiaow",type = "news")
public class Dept implements Serializable {
  @JestId
  private Integer id;

  private String name;

  public Dept(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public Dept() {
    super();
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name == null ? null : name.trim();
  }
}