package nqt_practice;

public class Ques_5 {
    public static void main(String[] args) {
        int n = 5244;
        int product = 1;

        int m = n;
        while(m>0){
            product = product*(m%10);
            m = m/10;
        }
        System.out.println(product);
    }
}
