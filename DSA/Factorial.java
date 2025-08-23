
import java.util.*;
class Factorial{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();

        int f=1;
        for (int i=1;i<=n;i++){
            f=f*i;

        }
        System.out.println(f);
    }
}