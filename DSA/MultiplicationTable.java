
import java.util.Scanner;

public class TwoTable {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Table You want :");
        int n=sc.nextInt();
        System.out.println("Enter No.of steps ");
        int s=sc.nextInt();

        for(int i=1;i<=s;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}
