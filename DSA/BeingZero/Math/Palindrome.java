import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            int rev=0;
            int num=sc.nextInt();
            int x=num;
            if(x<0 && x>Integer.MIN_VALUE){
                System.out.println("No");
                continue;
            }
            while(num!=0){
                int rem = num%10;
                rev = rev*10+rem;
                num=num/10;
            }
            if(rev==x)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
