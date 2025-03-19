package nqt_practice;

public class Ques_4 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6};
        int n = arr.length;
        int count = 1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]) count++;
        }
        System.out.println(count);
    }
}
