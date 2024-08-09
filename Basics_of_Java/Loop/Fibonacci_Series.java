import java.util.*;
class Fibonacci
{
  public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    int a = 0,b=1,c;
    int n = sc.nextInt();
    System.out.print("the fibonacci series is:");
  while(n>0)
  {
    System.out.print(" "+a);
    c = a+b;
    a = b;
    b = c;
    n--;
  }
 }
}
