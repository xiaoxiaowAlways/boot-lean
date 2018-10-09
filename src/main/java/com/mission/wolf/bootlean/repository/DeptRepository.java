package com.mission.wolf.bootlean.repository;

import com.mission.wolf.bootlean.entities.Dept;
import com.mission.wolf.bootlean.mapper.DeptMapper;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * @author Captain Wolf
 * 2018/9/17 21:55
 */
@Repository
@AllArgsConstructor
@CacheConfig(cacheNames="emp",cacheManager = "cacheManager")
public class DeptRepository {

  private DeptMapper deptMapper;




  @Cacheable(cacheNames = "dept")
  public Dept getById(Integer id) {
    return deptMapper.selectByPrimaryKey(id);
  }

}
