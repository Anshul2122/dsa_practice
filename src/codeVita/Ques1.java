package codeVita;

import java.util.ArrayList;


class Pair{
  int first, second;
  public Pair(int first, int second){
    this.first = first;
    this.second = second;
  }
}

public class Ques1 {
  public static int count(int[][] arr, int i, int j, int n, int m){
    int[] delrow = {-1,-1,0,1,1,1,0,-1};
    int[] delcol = {0,1,1,1,0,-1,-1,-1};
    int surr = 0;
    for(int k=0;k<8;k++){
      int nrow = i+delrow[k];
      int ncol = j+delcol[k];
      if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && arr[nrow][ncol]==1){
        surr++;
      }
    }
    return surr;
  }
  public static int func(int[][]arr, int n, int m){
    int[][] q = new int[n][m];
    ArrayList<Pair> list= new ArrayList<>();
    int max = Integer.MIN_VALUE;
    int res = 0;
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        if(arr[i][j]==1) {
          int surr = count(arr, i, j, n, m);
          q[i][j] = surr;
          max = Math.max(max, surr);
        }
      }
    }
    int smallest = Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        if(q[i][j]==max){
          list.add(new Pair(i+1,j+1));
        }
      }
    }

    for(Pair p:list){
      if(p.first+p.second<smallest){
        res = p.first+p.second;
        smallest = res;
      }
    }
    return  res;
  }
  public static void main(String[] args) {
    int n = 6;
    int m = 6;
    int[][] arr = {{2,0,0,0,0,0},{0,0,0,0,0,0},{0,0,1,1,1,0},{0,0,1,1,1,0},{0,0,1,1,1,0},{0,0,0,0,0,0},};

    System.out.println(func(arr,n,m));
  }
}
