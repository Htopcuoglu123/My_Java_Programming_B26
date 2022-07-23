package day53_abstraction.cars;

public abstract class ElectricCar extends Car{
    public abstract void charge();
  /*
  the Electric car is a sub class of the Car class

  The Car class was abstract and ElectricCar is also abstract

  Abstract class can have abstract methods
  so there is no problem to inherit and we do not need to override any method in this class
   */
}
