package com.bjsxt.controller;


import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestApolloController {
  @Value("${mysql.url:urlDefaultValue}")
  private String url;


  @Value("${mysql.username:usernameDefaultValue}")
  private String username;


  @RequestMapping("/test")
  @ResponseBody
  public String test() {
    System.out.println("url: " + url);
    System.out.println("username: " + username);
    return "ok";
  }

}
