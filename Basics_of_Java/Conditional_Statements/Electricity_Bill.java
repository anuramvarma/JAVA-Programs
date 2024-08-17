import java.util.*;
class  
{
    public static void main(String[] args) 
    {
         int n;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter No.Of Units Consumed : ");
         n=sc.nextInt();
             if(n<=50)
                  System.out.println("Your Bill= "+n*0.5);
             else if (n<=100)
                  System.out.println("Your Bill= "+(25+(n-50)*0.75));
             else if (n<=200)
                  System.out.println("Your Bill= "+(25+37.5+(n-100)*1.2));
             else
                  System.out.println("Your Bill= "+(25+37.5+120+(n-200)*1.50));
    }    
}
