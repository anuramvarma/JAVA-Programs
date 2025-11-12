 import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int t=sc.nextInt();
        while(t-- >0){
            int rows =sc.nextInt();
            int cols=sc.nextInt();
            long sum=0;
            for(int i=0;i<rows;i++){
                sum=0;
                for(int j=0;j<cols;j++){
                    long ele=sc.nextInt();
                    sum+=ele;
                }
                System.out.print(sum+" ");
            }

        System.out.println();
        }
    }
}
