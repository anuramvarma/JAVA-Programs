import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();    
        }
        long max=arr[0];
        long Smax=Long.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>max && Smax<arr[i]){    
                Smax=max;
                max=arr[i];
            }
            else if(arr[i]>Smax && arr[i]!=max){
                Smax=arr[i];
            }
        }
        System.out.print(max +" "+Smax);
    }
}
