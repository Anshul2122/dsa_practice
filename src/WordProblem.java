import java.util.*;

public class WordProblem {
    static int k, r, m, res = 0;
    static List<String> words = new ArrayList<>();

    public static void solve(int i, int[] lan, int cnt, List<String> qw) {
        if (i == qw.size()) {
            res = Math.max(res, cnt);
            return;
        }
        if (cnt + (qw.size() - i) <= res) return;

        for (int j = 0; j < r; j++) {
            if (lan[j] == 0) {
                lan[j] = qw.get(i).length();
                solve(i + 1, lan, cnt + 1, qw);
                lan[j] = 0;
                break;
            } else if (lan[j] + 1 + qw.get(i).length() <= m) {
                lan[j] += 1 + qw.get(i).length();
                solve(i + 1, lan, cnt + 1, qw);
                lan[j] -= 1 + qw.get(i).length();
            }
        }
        solve(i + 1, lan, cnt, qw);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < k; i++) {
            words.add(sc.nextLine());
        }
        r = sc.nextInt();
        m = sc.nextInt();

        List<String> qw = new ArrayList<>();
        for (String s : words) {
            if (s.length() <= m) qw.add(s);
        }

        qw.sort((a, b) -> {
            if (a.length() != b.length()) return Integer.compare(b.length(), a.length());
            return a.compareTo(b);
        });

        int[] lan = new int[r];
        solve(0, lan, 0, qw);
        System.out.println(res);
    }
}
