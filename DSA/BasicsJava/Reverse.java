
import java.util.Scanner;


public class Reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to reverse ");
        int m=sc.nextInt();

        int rev=0;

        while(m!=0){
            int rem= m%10;
            rev =rev*10+rem;
            m=m/10;

        }
        System.out.println("Reversed "+rev);
    }
}
