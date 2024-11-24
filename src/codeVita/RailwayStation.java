package codeVita;

import java.util.*;

public class RailwayStation {
  public static List<String> getAllSubstrings(String s, int n) {
    List<String> substrings = new ArrayList<>();
    Set<String> set = new HashSet<>();
    // Iterate over all possible starting points of the substring
    for (int i = 0; i < n; i++) {
      // Iterate over all possible ending points of the substring
      for (int j = i + 1; j <= n; j++) {
        // Add the substring from index i to j-1
        set.add(s.substring(i, j));
      }
    }
    for(String str : set) {
      substrings.add(str);
    }
    return substrings;
  }

  public static int func(String s, String st){
    int count = 0;
    int n = st.length();
    for(char c : s.toCharArray()){
      if(c=='1'){
        count++;
      }
    }
    StringBuilder str = new StringBuilder();

    if(count%2==0){
      for(int i=0;i<n;i++){
        if(st.charAt(i)=='0'){
          str.append('0');
        }
      }
    }
    else if(count%2!=0){
      for(int i=0;i<n;i++){
        if(st.charAt(i)=='1'){
          str.append('1');
        }
      }
    }
    return str.length();
  }
  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    String s = sc.nextLine();
//    int[][] arr = new int[n][2];
//    for (int i = 0; i < n; i++) {
//      for(int j = 0; j < 2; j++){
//        arr[i][j] = sc.nextInt();
//      }
//    }
//
//    for(int i = 0; i < n; i++){
//      arr[i][1] = arr[i][0] + arr[i][1];
//    }
//    Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
//
//    PriorityQueue<Integer> pq = new PriorityQueue<>();
//    pq.offer(arr[0][1]);
//    for(int i = 1; i < n; i++){
//      if(arr[i][0]<pq.peek()){
//        pq.offer(arr[i][1]);
//      }
//      else if(arr[i][0]>=pq.peek()){
//        pq.poll();
//        pq.offer(arr[i][1]);
//
//      }
//    }
//    System.out.println(pq.size());
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      String s = sc.next();
      List<String> result = getAllSubstrings(s, n);
      int min = Integer.MAX_VALUE;
      for(String str : result) {
        min = Math.min(min, func(str, s));
      }
      System.out.println(min);
    }
  }
}
