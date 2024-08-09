import java.util.*;
class Strong_Number
{
 static int Fact(int n)
 {
    
    int f = 1;
    for(int i=1;i<=n;i++)
    {
        f = f*i;
    }
    
    return f;
 }
  public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int rem,original=num;

    int sum =0;
   while(num>0)
{
    rem = num%10;
    sum += Fact(rem);
    num/=10;
  }
   if(sum==original)
        System.out.println("strong number");
   else
        System.out.println("not a strong number");
}
}
