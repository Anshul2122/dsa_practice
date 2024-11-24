import java.util.*;
public class practice2 {
    public static boolean function(int n){
        while(n>0){
            int a = n%10;
            if(a!=0 && a!=1){
                return false;
            }
            n=n/10;
        }
        return true;
    }
    public static boolean ans(int n){
        if(n==1 || n==14641){
            return true;
        }
        for(int i=1;i*i<=n;++i){
            if(n%i==0){
                if(function(i) && function(n/i)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            System.out.println(ans(n)?"YES":"NO");
//            char[][] arr = new char[n*2][n*2];
//            for(int i=0;i<2*n;i=i+2){
//                for(int j=0;j<2*n;j=j+2){
//                    if(i%4==0){
//                        if(j%4==0){
//                            arr[i][j]='#';
//                            arr[i+1][j]='#';
//                            arr[i][j+1]='#';
//                            arr[i+1][j+1]='#';
//                        }
//                        else{
//                            arr[i][j]='.';
//                            arr[i][j+1]='.';
//                            arr[i+1][j]='.';
//                            arr[i+1][j+1]='.';
//                        }
//                    }
//                    else{
//                        if(j%4==0){
//                            arr[i][j]='.';
//                            arr[i+1][j]='.';
//                            arr[i][j+1]='.';
//                            arr[i+1][j+1]='.';
//                        }
//                        else{
//                            arr[i][j]='#';
//                            arr[i+1][j]='#';
//                            arr[i][j+1]='#';
//                            arr[i+1][j+1]='#';
//                        }
//                    }
//                }
//            }
//            for(int i=0;i<2*n;i++){
//                for(int j=0;j<n*2;j++){
//                    System.out.print(arr[i][j]);
//                }
//                System.out.println();
//            }

        }
    }
}