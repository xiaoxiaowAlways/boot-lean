package com.mission.wolf.bootlean.config;

import com.mission.wolf.bootlean.entities.Dept;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.net.UnknownHostException;

/**
 * @author Captain Wolf
 * 2018/9/19 22:24
 */
@Configuration
public class MyRedisConfig {

//  @Primary
  @Bean
  public RedisTemplate<Object, Dept> deptRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
    RedisTemplate<Object, Dept> template = new RedisTemplate<>();
    template.setConnectionFactory(redisConnectionFactory);
    template.setDefaultSerializer(new Jackson2JsonRedisSerializer<>(Dept.class));
    return template;
  }

  @Bean
  public RedisCacheManager cacheManager(RedisTemplate<Object, Dept> deptRedisTemplate) {
    RedisCacheManager cacheManager = new RedisCacheManager(deptRedisTemplate);
    cacheManager.setUsePrefix(true);
    return cacheManager;
  }
}
