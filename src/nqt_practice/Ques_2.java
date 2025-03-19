package nqt_practice;

public class Ques_2 {
    public static void main(String[] args) {
        int n = 4;
        String s = Integer.toBinaryString(n);
        int i=0;

        s = s.replaceAll("1","2");
        s = s.replaceAll("0", "1");
        s = s.replaceAll("2", "0");

        n = Integer.parseInt(s, 2);

        System.out.println(n);

    }
}
