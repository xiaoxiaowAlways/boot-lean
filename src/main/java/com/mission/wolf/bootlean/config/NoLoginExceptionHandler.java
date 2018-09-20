package com.mission.wolf.bootlean.config;

import com.mission.wolf.bootlean.excaption.NoLoginException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Captain Wolf
 * 2018/9/20 21:09
 */
@ControllerAdvice
public class NoLoginExceptionHandler {

  @ResponseBody
  @ExceptionHandler(NoLoginException.class)
  public Map<String, Object> handlerException(Exception e) {
    Map<String, Object> map = new HashMap<>();
    map.put("code", "not login");
    map.put("message", e.getMessage());
    return map;
  }


  /**
   * 自适应
   */
 /* @ExceptionHandler(NoLoginException.class)
  public String handlerException(Exception e, HttpServletRequest request) {
    Map<String, Object> map = new HashMap<>();
    map.put("code", "not login");
    map.put("message", e.getMessage());
    //传入状态码
    request.setAttribute("javax.servlet.error.status_code", 400);
    return "forward:/error";
  }*/
}
