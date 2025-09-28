import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=0,b=1;
        int c;
        System.out.println("Enter n");
        int n =sc.nextInt();
        while(n>0){
        System.out.println(a);
            c=a+b;
            a=b;
            b=c;
            n--;
        }
    }
}
