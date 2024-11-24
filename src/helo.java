import java.util.*;

public class helo {
  public static boolean func(String s, int n){
    int[] arr = new int[26];
    for(char c:s.toCharArray()){
      if(c>='a'&&c<='z'){arr[c-'a']++;}
    }
    for(int i=0;i<26;i++){
      if(arr[i]!=1){
        return false;
      }
    }
    return true;
  }
  public static String isPangram(List<String> pangram) {
    // Write your code here
    StringBuilder sb = new StringBuilder();
    for(String st:pangram){
      st.replace(" ","");
      if(func(st,st.length()) == true){
        sb.append("1");
      }
      else{
        sb.append("0");
      }
    }
    return sb.toString();
  }
  
  public static void main(String[] args) {
    List<String> pangram = new ArrayList<>();
    pangram.add("we promptly judged antique ivory buckles for the next prize");
    pangram.add("we promptly judged antique ivory buckles for the prizes");
    pangram.add("the quick brown fox jumps over the lazy dog");
    pangram.add("the quick brown fox jump over the lazy dog");
    System.out.println(isPangram(pangram));
  }
}
