import java.util.*;
public class Method 
{
    static int add(int a,int b)
    {
        return a+b;

    }
        public static void main(String[] args)

        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter values of a,b : ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int Sum=add(a,b);
            System.out.println("Sum of A & B is : "+Sum);

        }
}
