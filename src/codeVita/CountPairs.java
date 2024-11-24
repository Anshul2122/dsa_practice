package codeVita;

import java.util.ArrayList;
import java.util.List;

public class CountPairs {
  public static int funcion(int[] arr, int n, int k){
    int c =0;
    for(int i=0;i<n;i++){
      int x = arr[i];
      int id1 = i;
      int id2 = i;
      if(i==0){
        while(arr[id2+1]==x){id2++;}
        if((arr[id2+1]<=x+k) && (arr[id2+1]>=x-k)){c++;}
      }
      else if(i<n-1){
        while(arr[id2+1]==x){id2++;}
        while (arr[id1-1]==x){id1--;}
        if(((arr[id1-1]<=x+k) && (arr[id1-1]>=x-k)) || ((arr[id2+1]<=x+k) && (arr[id2+1]>=x-k))){c++;}
      }
      else{
        while(arr[id1-1]==x){id1--;}
        if(arr[id1-1]<=x+k && arr[id1-1]>=x-k){c++;}
      }
    }
    return c;
  }
  public static void main(String[] args) {
    int n = 3;
    int[] arr = {5,1,3};
    int k =2;
    int res = funcion(arr,n,k);
    System.out.println(res);
//    List<Integer> list = new ArrayList<>();
//    for (int i = 0; i < arr.length; i++) {
//      list.add(arr[i]);
//    }
//    int k = 3;
//    int count = 0;
//    for(int i=0;i<n;i++){
//      int x = list.get(i);
//      int x1 = x - k;
//      int x2 = x + k;
//
//      for(int j=x1;j<=x2;j++){
//        if(j!=x && list.contains(j)){
//          count++;
//          break;
//        }
//      }
//    }
//    System.out.println(count);
  }
}
