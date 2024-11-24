import java.util.*;


public class CodeVita1 {

  public static boolean isSquareFree(int n){
    if(n%2==0){
      n=n/2;
    }
    if(n%2==0){
      return false;
    }

    for(int i=3;i<=Math.sqrt(n);i++){
      if(n%i==0){
        n=n/i;
        if(n%i==0){
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int count = 0;
    for (int i = 2; i < Math.sqrt(n); i++) {
      if(n%i==0) {
        if(isSquareFree(i)){count++;}
        if(isSquareFree(n/i)){count++;}
      }
    }
    System.out.println(count);
  }
}
