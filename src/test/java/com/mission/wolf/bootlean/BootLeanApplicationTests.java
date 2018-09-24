package com.mission.wolf.bootlean;

import com.mission.wolf.bootlean.entities.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


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

  @Autowired
  RabbitTemplate rabbitTemplate;

  @Test
  public void contextLoads() {
    System.out.println(dataSource);
    System.out.println(dataSource.getClass());
  }

  /**
   * String List Set Hash ZSet
   */
  @Test
  public void test01() {
    stringRedisTemplate.opsForValue().set("a", "ssss");
  }

  /**
   * 保存对象
   */
  @Test
  public void test02() {
    deptRedisTemplate.opsForValue().set("dep-02", new Dept(32, "xiaoxiaow"));
  }

  @Test
  public void amqpSendMsg() {
    //自己定义构造，定义消息体内容和消息头
    //rabbitTemplate.send(exchange,routeKey,message);

    //object默认当成消息体 只需要传入要发送的对象，自动序列化发送给rabbitMQ
    Map<String, Object> map = new HashMap<>();
    map.put("msg", "这是第一个消息");
    map.put("data", Arrays.asList("helloWorld", 123, true));
    //默认序列化后发送
    rabbitTemplate.convertAndSend("exchange.direct", "wolf.news", map);
    rabbitTemplate.convertAndSend("exchange.direct", "wolf.news", new Dept(2, "xiaoxiaowNews"));
  }

  /**
   * 接受数据
   */
  @Test
  public void amqpReceive() {
    Object o = rabbitTemplate.receiveAndConvert("wolf.news");
    System.out.println(o.getClass());
    System.out.println(o);
  }

  @Test
  public void amqpSendMsgFanout() {
    rabbitTemplate.convertAndSend("exchange.fanout", "", new Dept(2, "xiaoxiaowNews"));

  }
}
