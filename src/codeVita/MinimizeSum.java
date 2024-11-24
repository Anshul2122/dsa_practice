package codeVita;
import java.util.*;

public class MinimizeSum {
  public static void main(String[] args) {
    int n = 4;
    int[] arr = {20,7,5,4};
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0;i<n;i++){
      pq.add(arr[i]);
    }
    int k = 3;
    int sum = 0;
    System.out.println(pq);
    for (int i=0;i<k;i++){
      int top = pq.peek();
      pq.poll();
      top = (int)Math.floor(top/2);
      pq.offer(top);
    }
    System.out.println(pq);

    while(!pq.isEmpty()){
      sum += pq.poll();
    }
    System.out.println(sum);
     

  }
}
