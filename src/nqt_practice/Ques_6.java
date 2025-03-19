package nqt_practice;

public class Ques_6 {
    public static void main(String[] args) {
        int n = 99;
        int k = 3;
        int sum = 0;
        int m = n;
        while(m>0){
            sum += m%10;
            m=m/10;
        }
        int twice = k*sum;
        int res= 0;
        while(twice>0){
            res = res+twice%10;
            twice = twice/10;
        }
        System.out.println(res);
    }
}
