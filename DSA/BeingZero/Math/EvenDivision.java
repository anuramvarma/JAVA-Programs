import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t=sc.nextLong();
        for(int i=0;i<t;i++){
            long n=sc.nextLong();
            if(n!=2 && n%2==0){
                System.out.println("YES");  
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
