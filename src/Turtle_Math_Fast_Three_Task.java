import java.util.*;
public class Turtle_Math_Fast_Three_Task {
    public static int function(int[] arr, int n, int sum){
        if(sum%3==0) return 0;
        for(int i=0;i<n;i++){
            if((sum - arr[i])%3==0) return 1;
        }
        if((sum+1)%3==0) return 1;
        return 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                sum = sum + arr[i];
            }
            int res = function(arr, n, sum);
            System.out.println(res);
        }
    }
}