import java.util.*;
class Palindrome
{
  public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  int rem,rev=0,original=num;
  while(num!=0)
  {
    rem = num%10;
    rev = rev*10+rem;
    num = num/10;
  }
   if(original==rev)
    {
      System.out.println("palindrome");
    }
   else
     {
       System.out.println("not a palindrome");
      }
  }
}
