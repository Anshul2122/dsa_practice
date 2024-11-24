package oops2;

class Scooter{
    void braking(Car car){
        System.out.println(car.model+" is braking");
    }
}

public class Car extends Vehicle {

    Car(){
        super(3,"M 10");
        System.out.println("car is being created...");

    }

    String color;

    //method overriding
    void start(){
        Scooter scooterObj = new Scooter();
        scooterObj.braking(this);
        System.out.println("ye hai is method ka referenec : "+this);
        System.out.println("Car is running...");
    }

    Car braking(){
        return this;
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelsCount = 4;
        obj.model = "M 10";
        obj.color = "red";
        System.out.println(obj.color);
        System.out.println("car have "+obj.wheelsCount+" wheels and "+ "car model is: "+obj.model);
        obj.start();


    }
}
