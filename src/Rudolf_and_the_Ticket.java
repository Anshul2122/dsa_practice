import java.util.Scanner;

public class Rudolf_and_the_Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int animal = n/4 + (n%4)/2;
            System.out.println(animal);
//            int m= sc.nextInt();
//            int k=sc.nextInt();
//            int[] left = new int[n];
//            int []right = new int[m];
//            for(int i=0;i<n;i++){
//                left[i] = sc.nextInt();
//            }
//            for(int i=0;i<m;i++){
//                right[i] = sc.nextInt();
//            }
//            int count=0;
//            for(int i=0;i<n;i++){
//                for(int j=0;j<m;j++){
//                    if(left[i]+right[j]<=k){
//                        count++;
//                    }
//                }
//            }
//            System.out.println(count);
        }
    }
}
