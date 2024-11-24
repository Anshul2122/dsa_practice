package oops4;

public class LearnInnerClass {
  class Toy{
    int price;
  }

  static class PlayStation{
    int price;
  }

  public static void main(String[] args) {

    LearnInnerClass obj = new LearnInnerClass();
    Toy t = obj.new Toy();
    t.price = 10;
    System.out.println(t.price);

    PlayStation play = new LearnInnerClass. PlayStation();
  }
}
