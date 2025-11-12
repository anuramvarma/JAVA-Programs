import java.util.*;
class Greatest_of_Three
{
    public static void main(String[] args) 
    {
        int a;
        int b;
        int c;
        Scanner s=new Scanner(System.in);
         System.out.println("Enter a value of a: ");
        a=s.nextInt();
         System.out.println("Enter value of b");
        b=s.nextInt();
          System.out.println("Enter value of c");
        c=s.nextInt();
        if (a>b)
          System.out.println("A is Big ");
        else if (b>a)
          System.out.println("B is Big ");
        else
          System.out.println("C is Big");
    }
}
