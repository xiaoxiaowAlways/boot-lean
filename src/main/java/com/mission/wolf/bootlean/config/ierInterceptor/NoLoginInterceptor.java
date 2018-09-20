package com.mission.wolf.bootlean.config.ierInterceptor;

import com.mission.wolf.bootlean.excaption.NoLoginException;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

/**
 * @author Captain Wolf
 * 2018/9/20 21:28
 */
public class NoLoginInterceptor implements HandlerInterceptor {
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse httpServletResponse, Object o) throws Exception {
    String loginToken = null;
    if (request.getCookies() == null) {
      throw new NoLoginException("未登录");
    }
    for (Cookie cookie : request.getCookies()) {
      if ("login_token".equals(cookie.getName())) {
        loginToken = cookie.getValue();
        break;
      }
    }

    if (loginToken == null) {
      throw new NoLoginException("未登录");
    }
    // TODO: 2018/9/20 通过redis验证login_token有效性
    if (!loginToken.equals("xiaoxiaow123")){
      throw new NoLoginException("未登录");
    }
    return true;
  }

  @Override
  public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

  }

  @Override
  public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

  }
}
