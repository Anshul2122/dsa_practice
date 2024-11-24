import java.util.*;
public class Turtle_Fingers_Count_the_Values_of_k {
    public static int function(int a, int b, int l){
        Set<Integer> set = new HashSet<>();
        for(int x=0;x<=20;x++){
            if(Math.pow(a,x)>l) break;
            for(int y=0;y<=20;y++){
                if(Math.pow(b,y)>l) break;
                int c = (int)(Math.pow(a, x) * Math.pow(b, y));
                if(l%c==0) {
                    set.add(l/c);
                }
            }
        }
        return set.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int l = sc.nextInt();
            int res = function(a,b,l);
            System.out.println(res);
        }
    }
}
