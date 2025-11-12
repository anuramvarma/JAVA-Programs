import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            long arr[]= new long[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
            }
            long diff[]= new long[n+1];

            int q=sc.nextInt();
            while(q-- >0){
                int i=sc.nextInt();
                int j=sc.nextInt();
                long x =sc.nextLong();

                diff[i] +=x;
                if(j+1<n){
                    diff[j+1]-=x;
                }
            }
            long curr =0;
            long tsum=0;
            for(int i=0;i<n;i++){
                curr +=diff[i];
                arr[i] +=curr;
                tsum += arr[i];
            }
            System.out.println(tsum);
        }
    }
}
