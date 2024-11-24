import java.util.*;
public class practice {
//        public static boolean isMagic(String number) {
//            for (int i = 0; i < number.length(); i++) {
//                if (number.charAt(i) != '1' && number.charAt(i) != '4') {
//                    return false;
//                }
//            }
//            if (number.charAt(0) == '4') {
//                return false;
//            }
//            if (number.indexOf("444") != -1) {
//                return false;
//            }
//            return true;
//        }
    public static int funtion(int[] arr, int[] brr, int n, int m){
        Stack<Integer> st =new Stack<>();
        Queue<Integer> q = new ArrayDeque<>();
        int res = 0;
        return res;
    }
        public static void main(String[] args) {
            int[] arr = {1,1,0,0};
            int n = arr.length;
            int[] brr = {0,1,0,1};
            int m = brr.length;
            int notEat = funtion(arr,brr,n,m);

//            Scanner sc = new Scanner(System.in);
//            int t = sc.nextInt();
//            int count = 0;
//            while(t>=5){
//                t -= 5;
//                count++;
//            }
//            if(t>0){
//                count = count + 1;
//            }
//            System.out.println(count);
        }
}
//            Scanner sc = new Scanner(System.in);
//            String number = scanner.next();
//            scanner.close();
//
//            System.out.println(isMagic(number) ? "Yes" : "No");
//            Scanner sc= new Scanner(System.in);
//            String s = sc.next();
//
//            StringBuilder str = new StringBuilder();
//            s=s.toLowerCase();
//            for(char c:s.toCharArray()){
//                if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='y'){
//                    str.append('.');
//                    str.append(c);
//                }
//
//            }
//            System.out.println(str);
//

//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            int n = sc.nextInt();
//            for (int i = n; i >= 0; i--) {
//                if (i % x == y) {
//                    System.out.println(i);
//                    break;
//                }
//            }

//        String s = Integer.toString(n);
//        StringBuilder str = new StringBuilder();
//        boolean flag = true;
//        for(char c:s.toCharArray()){
//            if(c!='1'&& c!='4') {
//                System.out.println("false");
//                break;
//            }
//            else{
//                str.append(c);
//            }
//            if(str.equals("1") || str.equals("14")){
//                flag = true;
//                str = new StringBuilder();
//            }
//            else{
//                System.out.println("false");
//                break;
//            }
//        }
//        System.out.println("true");

