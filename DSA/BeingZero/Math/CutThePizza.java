import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
        int n=sc.nextInt();
        if(n%2==0 || n==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        }
    }
}
