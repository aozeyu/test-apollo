package com.bjsxt.controller;



// Decorator class that implements the Car interface and contains an instance of the Car interface
public class CarDecorator implements Car{
  protected Car car;

  public CarDecorator(Car car) {
    this.car = car;
  }

  @Override
  public void assemble() {
    car.assemble();
  }
}
