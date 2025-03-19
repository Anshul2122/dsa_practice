package nqt_practice;

import java.util.ArrayList;

public class Ques_1 {
    public static int[] moveZeros(int[] arr, int n){
        int i=0;
        for(int x: arr){
            if(x!=0){
                arr[i++] = x;
            }
        }
        while(i<=n-1){
            arr[i++] = 0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,0,1,9,0,5,0};
        int n = arr.length;

        moveZeros(arr, n);
        for (int x: arr){
            System.out.print(x + " ");
        }
    }
}
