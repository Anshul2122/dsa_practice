package oops4;

abstract class Vehicle{
  abstract int breaks(int wheels);
  abstract void accelerate();
}
class Car extends Vehicle{

  void accelerate(){
    System.out.println("Car is accelerating....");
  }
  int breaks(int wheels){
    System.out.println("Car breaks are pushed!!");
    return wheels;
  }

}
public class LearnAbstract {
  public static void main(String[] args) {
    //
    Car car = new Car();
    car.accelerate();
    System.out.println(car.breaks(5));
  }
}
