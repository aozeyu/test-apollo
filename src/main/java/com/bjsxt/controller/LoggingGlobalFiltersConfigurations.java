package com.bjsxt.controller;


import org.slf4j.*;
import org.springframework.cloud.gateway.filter.*;
import org.springframework.context.annotation.*;
import reactor.core.publisher.*;

@Configuration
public class LoggingGlobalFiltersConfigurations {
  final Logger logger =
      LoggerFactory.getLogger(
          LoggingGlobalFiltersConfigurations.class);

  @Bean
  public GlobalFilter postGlobalFilter() {
    return (exchange,chain) -> {
      return chain.filter(exchange).then(Mono.fromRunnable(() -> {
        logger.info("Global Post Filter executed");
      }));
    };
  }
}
