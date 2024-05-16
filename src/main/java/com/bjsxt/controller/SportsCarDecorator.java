package com.bjsxt.controller;

public class SportsCarDecorator extends CarDecorator{

  public SportsCarDecorator(Car car) {
    super(car);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println("Adding features of Sports Car.");
  }
}
