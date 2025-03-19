package nqt_practice;

public class Ques_8 {
    public static int func(int[] arr, int n, int k){
        int sum = 0;
        int left = 0;
        int right = n-1;
        while(k>0){
            if(arr[left]==arr[right]){
                sum += arr[left];
                left++;
                right--;
            }
            else if(arr[left]>arr[right]){
                sum += arr[left];
                left++;
            } else{
                sum += arr[right];
                right--;
            }
            k--;
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,1};
        int n = arr.length;
        int k = 3;


        System.out.println(func(arr, n, k));
    }
}
