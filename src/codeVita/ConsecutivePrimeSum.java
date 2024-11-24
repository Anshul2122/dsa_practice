package codeVita;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsecutivePrimeSum {
  public static boolean isPrime(int n) {
    for (int i = 2; i <=Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
  public static int consecutivePrimeSum(int n) {
    int count = 0;
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 2; i <= n; i++) {
      if(isPrime(i)) {
        list.add(i);
      }
    }
    System.out.println(list);

    for(int i=2;i<list.size();i++) {
      int target = list.get(i);
      int sum = 0;
      for(int j=0;j<i;j++) {
        sum += list.get(j);
        if (sum == target) {
          count++;
          System.out.println(sum);
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count= consecutivePrimeSum(n);
    System.out.println(count);
  }
}
