import java.util.*;
import java.io.*;

class Main {
    static int fib[]=new int[1000000+1];
    static int MOD=(int)1e9+7;
    static{
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=1000000;i++){
            fib[i]=(fib[i-1]%MOD +fib[i-2]%MOD)%MOD;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- !=0){
            int n=sc.nextInt();
            System.out.println(fib[n]);
        }
    }
}
