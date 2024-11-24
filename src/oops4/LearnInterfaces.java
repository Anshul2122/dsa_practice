package oops4;

public class LearnInterfaces {
  public static void main(String[] args) {
    Monkey m = new Monkey();
    m.eats();
    m.walks();
    m.walk();
  }
}

interface Human{
  void walks();
}

interface Animal {
  void eats();
  default void walk() {
    System.out.println("walking...");
  }
}

class Monkey implements Animal,Human {
  @Override
  public void eats() {
    System.out.println("Monkey is eating...");
  }
  public void walks() {
    System.out.println("Monkey is walking...");
  }

}