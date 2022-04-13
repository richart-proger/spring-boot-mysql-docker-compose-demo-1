package com.myexample.springbootdemo1.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RestApiResponse {

  private int status;
  private String message;
  private Object data;

  public RestApiResponse(int status, String message) {
    this.status = status;
    this.message = message;
  }
}
