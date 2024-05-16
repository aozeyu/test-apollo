package com.bjsxt.controller;

public class DecoratorDemo {
  public static void main(String[] args) {
    Car basicCar = new BasicCar();
    basicCar.assemble();

    //装饰器
    SportsCarDecorator sportsCarDecorator = new SportsCarDecorator(new BasicCar());
    sportsCarDecorator.assemble();

  }
}
