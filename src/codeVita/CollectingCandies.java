package codeVita;

import java.util.PriorityQueue;
import java.util.Scanner;

public class CollectingCandies {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] candies = new int[n];
    for (int i = 0; i < n; i++) {
      candies[i] = sc.nextInt();
    }

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (n==1){
        System.out.println(candies[0]);
        break;
      }
      pq.add(candies[i]);
    }
    while (pq.size()!=1) {
      if(n==1) break;
      int sum = pq.poll() + pq.poll();
      pq.add(sum);
      count+=sum;
    }
    if(n!=1) {
      System.out.println(count);
    }
  }
}
