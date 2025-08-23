import java.util.*;
public class StrongNumber {
    public static int fact(int a){
        int f=1;
        for (int i=1;i<=a;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n=sc.nextInt();
       int sum=0;
        int num =n;
        while(num!=0){
            int rem=num%10;
            sum=sum+fact(rem);
            num=num/10;
        }
        if(sum==n){
            System.out.println("It is a Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
}
}