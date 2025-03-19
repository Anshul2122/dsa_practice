package nqt_practice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.HashSet;
public class Ques_9 {
    public static void func(int[] arr, int n){
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        StringBuilder sb= new StringBuilder(s);
        String [] arr = s.split(" ");
        int n = Integer.parseInt(arr[0]);
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(arr[i+1]);
        }

        func(nums, n);
        sc.close();
    }
}
