package oops4;

public class LearnAnomymousClasses {
  // class InnerClass extends OuterClass{}
  OuterClass obj = new OuterClass(){
    void sing(){
      System.out.println("singing...");
    }
  };

  public static void main(String[] args) {
    OuterClass obj = new OuterClass();
    MyFunction func = (x) -> x + 1;  // Lambda for incrementing

    System.out.println(func.apply(4));  // Call the lambda with argument 4
  }
}

@FunctionalInterface
interface MyFunction {
  int apply(int x);  // Single abstract method
}

class OuterClass{
  public void outerMethod(){
    System.out.println("OuterClass");
  }
}
