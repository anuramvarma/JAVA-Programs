import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            long m=sc.nextLong();
            long n=sc.nextLong();
            long sum=(Math.abs(n-m)+1)*(n+m)/2;
            System.out.println(sum);
        }
    }
}
