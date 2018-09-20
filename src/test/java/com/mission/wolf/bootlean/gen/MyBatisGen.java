package com.mission.wolf.bootlean.gen;

import com.alibaba.fastjson.JSONObject;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Captain Wolf
 * 2018/9/17 21:41
 */
public class MyBatisGen {

  @Test
  public void genMapper() throws Exception {
    List<String> warnings = new ArrayList<String>();
    //是否覆盖
    boolean overwrite = true;
    String genCfg = "/gen/mbgConfiguration.xml";
    File configFile = new File(MyBatisGen.class.getResource(genCfg).getFile());
    ConfigurationParser cp = new ConfigurationParser(warnings);
    Configuration config = cp.parseConfiguration(configFile);
    DefaultShellCallback callback = new DefaultShellCallback(overwrite);
    MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
    myBatisGenerator.generate(null);
  }


  @Test
  public void jsonTest(){
    Map<String,Object>map = new HashMap<>();
    map.put("2","sss");
    map.put("23","sss");

    System.out.println(JSONObject.toJSONString(map));
  }
}
