package oops2;

public class Vehicle {
    int wheelsCount;
    String model;

    Vehicle(){
        System.out.println("Vehicle is being created");
    }
    Vehicle(int wheelsCount, String model){
        this.wheelsCount = wheelsCount;
        this.model = model;
        System.out.println("vehile have "+wheelsCount+" wheels and " + "Model is: "+model);
    }

    final void gear(){
        System.out.println("gearing is changing");
    }

    void start(){
        System.out.println(this);
        System.out.println("vehicle started...");
    }
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start();
    }
}
