package com.mission.wolf.bootlean;

import com.mission.wolf.bootlean.entities.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BootLeanApplicationTests {

  @Autowired
  StringRedisTemplate stringRedisTemplate;

  @Autowired
  RedisTemplate redisTemplate;

  @Autowired
  RedisTemplate deptRedisTemplate;

  @Autowired
  DataSource dataSource;

  @Test
  public void contextLoads() {
    System.out.println(dataSource);
    System.out.println(dataSource.getClass());
  }

  /**
   * String List Set Hash ZSet
   *
   */
  @Test
  public void test01(){
    stringRedisTemplate.opsForValue().set("a","ssss");
  }

  /**
   * 保存对象
   */
  @Test
  public void test02(){
    deptRedisTemplate.opsForValue().set("dep-02",new Dept(32,"xiaoxiaow"));
  }
}
