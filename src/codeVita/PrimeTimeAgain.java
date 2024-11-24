package codeVita;

import java.util.Scanner;

public class PrimeTimeAgain {
  public static boolean isPrime(int n) {
    if (n <= 1) return false;  // 0 and 1 are not primes
    for (int i=2;i*i<=n;i++) {  // check odd numbers only up to sqrt(n)
      if (n%i == 0) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int P = sc.nextInt();
    int p = D / P;
    int t = 1;
    int[][] time = new int[P][p];
    for (int i = 0; i < P; i++) {
      for (int j = 0; j < p; j++) {
        time[i][j] = t++;
      }
    }
    int total = 0;
    boolean flag = false;
    for (int i = 1; i < p; i++) {
      if (isPrime(time[0][i])) {
        flag = true;
        for (int j = 1; j < P; j++) {
          if (!isPrime(time[j][i])) {
            flag = false;
            break;
          }
        }
        if (flag) {
          total++;
        }
      }
    }
    System.out.println(total);
  }
}