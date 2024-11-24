import java.util.Arrays;
import java.util.Scanner;

public class Turtle_Tenacity_Continual_Mods {
    public static String function(int[] arr, int n, int minRepeat, int minNumber){
        Arrays.sort(arr);
        for(int i=1;i<n;i++) {
            if (arr[i] > arr[i - 1]) {
                break;
            } else {
                minRepeat++;
            }
        }
        if(minRepeat==1) return "yes";
        else{
            for(int i=0;i<n;i++){
                int value = arr[i]%minNumber;
                if(value<minNumber) return "yes";
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int minNumber = Integer.MAX_VALUE;
            int minRepeat = 1;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                minNumber = Math.min(arr[i],minNumber);
            }
            System.out.println(function(arr,n,minRepeat,minNumber));
        }
    }
}
