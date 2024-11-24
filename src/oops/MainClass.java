package oops;

class Dog{
    String name;
    int age;
    String color;

    void walk(){
        System.out.println("dog is walking");
    }

    void bark(){
        System.out.println("dog is barking");
    }


}

class Complex{
    int a, b;
    void print(){
        System.out.println(a+" + "+b+"i");
    }
}

class Cat{
    String name;
    int age;
}

public class MainClass {
    public static void main(String[] args) {

//        Dog d1 = new Dog();
//        d1.walk();
//        d1.bark();
//        Dog d2 = new Dog();
//        d2.name = "snow";
//        System.out.print(d2.name);
//        System.out.print(" ");
//        d2.walk();

        Complex num1 = new Complex();
        num1.a = 3;
        num1.b = 5;
        num1.print();
        Complex num2 = new Complex();
        num2.a = 4;
        num2.b = 3;
        num2.print();
        int number1 = num1.a+num2.a;
        int number2 = num1.b+num2.b;
        System.out.println(number1 +" + "+number2+"i");
    }
}