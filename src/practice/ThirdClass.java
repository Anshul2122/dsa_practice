package practice;

public class ThirdClass extends SecondClass {
    public void m4(){
        System.out.println("this is grand child of first class");
    }
    public static void main(String[] args) {
        ThirdClass tt = new ThirdClass();
        tt.m4();
        tt.m2();
        tt.m1();
    }
}
