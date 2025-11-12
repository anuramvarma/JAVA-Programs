import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){

            long l=sc.nextLong();
            long r=sc.nextLong();
            long s=sc.nextLong();
            long sum = (Math.abs(l-r)+1)*(l+r)/2;
            if(s==sum){
                System.out.println("NEUTRAL");
            }
            else if(sum>s){
                System.out.println("DECREASE "+ (sum-s));
            }
            else{
                System.out.println("INCREASE "+(s-sum));
            }
        }
    }
}
