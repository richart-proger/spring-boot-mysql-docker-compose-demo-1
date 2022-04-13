package com.myexample.springbootdemo1.response;

public class RestApiException extends RuntimeException {

  public RestApiException(String message) {
    super(message);
  }
}
