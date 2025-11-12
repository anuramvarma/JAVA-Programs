import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int row1=sc.nextInt();
            int col1=sc.nextInt();
            long a[][]=new long[row1][col1];

            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    long ele=sc.nextLong();
                    System.out.print((a[i][j]+ele)+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
