package com.mission.wolf.bootlean.excaption;

/**
 * @author Captain Wolf
 * 2018/9/20 21:10
 */
public class NoLoginException extends RuntimeException {

  public NoLoginException(String message) {
    super(message);
  }
}
