package com.mission.wolf.bootlean.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Captain Wolf
 * 2018/9/9 11:55
 */
@Configuration
public class DruidConfig {

  @ConfigurationProperties(prefix = "spring.datasource")
  @Bean
  public DataSource druid() {
    return new DruidDataSource();
  }

  //配置druid监控
  //1.配置管理后台的servlet
  @Bean
  public ServletRegistrationBean statViewServlet() {
    ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");

    Map<String, String> map = new HashMap<>();
    map.put("loginUsername", "root");
    map.put("loginPassword", "123456");
//    map.put("allow", "");
//    map.put("deny", "xiaoxiaow");
    bean.setInitParameters(map);
    return bean;
  }

  //2.配置web监控的filter
  @Bean
  public FilterRegistrationBean webStatFilter() {
    FilterRegistrationBean bean = new FilterRegistrationBean();
    Map<String, String> map = new HashMap<>();
    map.put("exclusions", "*.js,*.css,/druid/*");


    bean.setFilter(new WebStatFilter());
    bean.setInitParameters(map);
    bean.setUrlPatterns(Arrays.asList("/*"));
    return bean;
  }

}
