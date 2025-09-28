import java.util.*;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num to Armstrong or not ");
        int n =sc.nextInt();
        int num =n;
        int num1=n;
        int count =0;
        int rem;
        while(num1!=0){
                 rem=num1%10;
                num1=num1/10;
                count++;                
        }
        int sum=0;
        while(num!=0)
        {
            rem=num%10;
            sum+=Math.pow(rem,count);
            num=num/10;
        }

        if(sum==n){
            System.out.println("Armstrong");

        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
