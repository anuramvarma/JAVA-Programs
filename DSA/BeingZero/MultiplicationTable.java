import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m=sc.nextInt();
        while(m>0){
            int n =sc.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(n+" * "+i+" = "+n*i);
            }
            System.out.println(" ");
            m--;
        }
    }
}
