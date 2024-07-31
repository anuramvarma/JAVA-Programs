import java.util.*;
class Basics
{
    public static void main(String[] args) 
    {
      int a;
      int b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter value of a :");
      a=sc.nextInt();
      System.out.println("Enter value of b :"); 
      b=sc.nextInt();  
      System.out.println("IS A is Greater than B: "+(a>b));
      System.out.println("IS A is less than B: "+(a<b));
      System.out.println("IS A is Greater than or Equal to B: "+(a>=b));
      System.out.println("IS A is less than or Equal to B:  "+(a<=b));
      System.out.println("IS A is Equal to B: "+(a==b));
      System.out.println("IS A is Not Equal to B: "+(a!=b));
    }

}


