package nqt_practice;

import java.util.*;

public class Ques_7 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = 0;
            int y=0;
            String s = sc.next();
            for(char c:s.toCharArray()){
                if(c=='U'){
                    y--;
                } else if(c=='D'){
                    y++;
                } else if(c=='L'){
                    x--;
                } else if (c=='R') {
                    x++;
                }
            }
            System.out.println(y+" "+ x);
        }

    }
}
