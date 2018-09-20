package com.mission.wolf.bootlean.config;

import com.mission.wolf.bootlean.config.ierInterceptor.NoLoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Captain Wolf
 * 2018/9/20 20:57
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new NoLoginInterceptor());
  }
}
