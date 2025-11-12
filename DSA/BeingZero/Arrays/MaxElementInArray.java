import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n =sc.nextInt();
            long max=Long.MIN_VALUE;
            for(int i=0;i<n;i++){
                long ele=sc.nextLong();
                if(ele>max){
                    max=ele;
                }
            }
            System.out.print(max);
        System.out.println();
        }
    }
}
