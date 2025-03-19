package practice;

public class ForthClass extends FirstClass {
    public void m3(){
        System.out.println("this is second child of first class");
    }

    public static void main(String[] args) {
        ForthClass fc = new ForthClass();
        fc.m1();
    }
}
