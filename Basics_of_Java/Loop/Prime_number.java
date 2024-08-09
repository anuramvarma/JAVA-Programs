
import java.util.*;
class Prime_number
{
   public static void main(String[] args)
   {
     int n;
     int i;
     int f=0;
     System.out.println("Enter a number to find it is prime or not : ");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     for(i=1;i<=n;i++)
     {
        if(n%i==0)
        {
            f+=1;
        }
     }
     if(f==2)
     {
        System.out.println("Prime Number");
    
     }
     else
     {
       System.out.println("Not a Prime Number");

     }
   }

}
