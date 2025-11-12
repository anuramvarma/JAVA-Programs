import java.util.*;
class Nature_of_number 
{
    public static void main (String args[]) 
  {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check it's Nature:");
        int n=sc.nextInt();
        if (n<0) 
        {
            System.out.println("The Entered number is Negative");
        }
        else if(n>0) 
        {
            System.out.println("The Entered number is Postive");
        }
        else 
        {
            System.out.println("The Entered number is Neither Postive nor Negative");
        }
    }
}
