import java.util.*;
import java.io.*;
class Main {
    private static boolean isPrimeNumber(long n){
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        for(long i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int k=1;k<=t;k++){
            long n=sc.nextLong();
            String result = isPrimeNumber(n) ? "YES":"NO";
            System.out.println("Test Case #"+k+": "+result);
        }
    }
}
