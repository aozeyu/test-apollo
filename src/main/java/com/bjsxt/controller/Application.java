package com.bjsxt.controller;

import com.ctrip.framework.apollo.spring.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.*;

@SpringBootApplication
@EnableApolloConfig
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class,args);

  }
}