package oops;

class Complexs{
    int a, b;
    public Complexs(int a, int b){
        this.a = a;
        this.b = b;
    }
    void print(){
        System.out.println(a+" + "+b+"i");
    }
    Complexs  add(Complexs num2){
        return new Complexs(a+num2.a, b+num2.b);
    }
}

public class LearnConstructors {
    public static void main(String[] args) {
        Complexs num1 = new Complexs(4, 5);
//        num1.print();
//        num1.a = 5;
//        num1.print();
        Complexs num2 = new Complexs(4,1);
        Complexs res = num1.add(num2);
        System.out.println(num1);
        res.print();
    }
}
