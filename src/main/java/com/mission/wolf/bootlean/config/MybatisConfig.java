package com.mission.wolf.bootlean.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @author Captain Wolf
 * 2018/9/9 12:38
 */
@org.springframework.context.annotation.Configuration
public class MybatisConfig {
  @Bean
  public ConfigurationCustomizer configurationCustomizer() {
    return new ConfigurationCustomizer() {
      @Override
      public void customize(Configuration configuration) {
        configuration.setMapUnderscoreToCamelCase(true);
      }
    };
  }
}
