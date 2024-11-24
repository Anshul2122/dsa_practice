package codeVita;

public class ThreePalinDeromic {
  public static boolean isPalindrome(String str) {
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString().equals(str);
  }
  public static void main(String[] args) {
    String s = "aabaabbccc";
    if(s.length()<3) {
      System.out.println("Imp");
      return;
    }
    String s1="";
    String s2="";
    String s3="";
    if(s.length()==3) {
      System.out.println(s.charAt(0) + "," + s.charAt(1) + "," + s.charAt(2));
      return;
    }
    else{
      for(int i=0;i<s.length()-2;i++){
        s1 = s.substring(0,i);
        if(isPalindrome(s1)){
          for(int j=i+1;j<s.length()-1;j++){
            s2 = s.substring(i,j);
            if(isPalindrome(s2)){
              s3 = s.substring(j,s.length());
              if(isPalindrome(s3)){
                System.out.println(s1+","+s2+","+s3);
                return;
              }
            }
          }
        }
      }
    }
    System.out.println("imp");
  }
}
