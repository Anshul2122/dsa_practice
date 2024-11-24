import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Balance {
    static int k, r, m, res = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int operations = sc.nextInt();
        String read = "read";
        String credit = "credit";
        String debit = "debit";
        String abort = "abort";
        String rollback = "rollback";
        String commit = "commit";
        int cb=0;
        List<Integer> t = new ArrayList<>();
        List<Integer> cs = new ArrayList<>(Arrays.asList(money));

        for(int i=0;i<operations;i++){
            String s = sc.next();
            if(s.equals(read)){
                System.out.println(cs.get(cb));
            } else if (s.equals(credit) || s.equals(debit)) {
                int x = sc.nextInt();
                if(s.equals(credit)){
                    cs.set(cb, cs.get(cb) + x);
                } else{
                    cs.set(cb, cs.get(cb) - x);
                }
                t.add(s.equals(credit) ? x : -x);
            } else if(s.equals(abort)){
                int x = sc.nextInt();
                if(x<=t.size()){
                    cs.set(cb, cs.get(cb)-t.get(x-1));
                    t.set(x-1,0);
                }
            } else if (s.equals(rollback)) {
                int x = sc.nextInt();
                cb = x-1;
                cs = new ArrayList<>(cs.subList(0,cb+1));
            } else if (s.equals(commit)) {
                cs.add(cs.get(cb));
                cb++;
            }
        }

    }
}
