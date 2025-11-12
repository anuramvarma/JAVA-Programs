import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int rows=sc.nextInt();
            int cols=sc.nextInt();
            long sum=0;
            int matrix[][]=new int[rows][cols];
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
            for(int j=0;j<cols;j++){
                sum=0;
                for(int i=0;i<rows;i++){
                    //long ele=sc.nextInt();
                    sum+=matrix[i][j];
                }
                System.out.print(sum+" ");
            }
        System.out.println();
        }
    }
}
