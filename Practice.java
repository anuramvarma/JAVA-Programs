import java.util.*;
class Practice
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
        int d=a+b*c+b^2;
         System.out.println("RESULT =\n" + d);
    }
}
