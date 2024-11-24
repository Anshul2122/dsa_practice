import java.util.Scanner;

public class Vlad_and_the_Best_of_Five {
    public static  int function(int n){
          int[] arr = new int[1000001];
          for(int i=1;i<200000;i++){
              int g=i,h=0;
              while(g>0){
                  h += g%10;
                  g=g/10;
              }
              arr[i] = arr[i-1]+h;
          }
          return arr[n];

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int sum = function(n);
            System.out.println(sum);
        }
    }
}
