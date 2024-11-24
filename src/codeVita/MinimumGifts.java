package codeVita;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumGifts {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      int[] gifts = new int[n];
      int sum = 0;
      gifts[0] = 1;
      for(int i=1;i<n;i++){
        if(arr[i]>arr[i-1]){
          gifts[i] = gifts[i-1]+1;
        }
        else{
          gifts[i] = 1;
        }
      }

      for(int i=n-2;i>=0;i--){
        if( (arr[i] >arr[i+1]) && (gifts[i]<=gifts[i+1])){
          gifts[i] = gifts[i+1]+1;
        }
      }
      for(int x:gifts){
        sum+=x;
      }
      System.out.println(sum);
    }
  }
}
