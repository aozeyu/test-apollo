package com.bjsxt.controller;

import org.slf4j.*;
import org.springframework.cloud.gateway.filter.*;
import org.springframework.stereotype.*;
import org.springframework.web.server.*;
import reactor.core.publisher.*;

@Component
public class LoggingGlobalPreFilter implements GlobalFilter {

  final Logger logger =
      LoggerFactory.getLogger(LoggingGlobalPreFilter.class);

  @Override
  public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
    logger.info("Global Pre Filter executed");
    return chain.filter(exchange);
  }
}
