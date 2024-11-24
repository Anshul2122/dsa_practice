package oops;

class Greet{
    void greetings(){
        System.out.println("hello good morning");
    }

    void greetings(String name){
        System.out.println("hello "+ name+" good morning!");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Greet g = new Greet();

        g.greetings();
        g.greetings("varun");
    }
}
