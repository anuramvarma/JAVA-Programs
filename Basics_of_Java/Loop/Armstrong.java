import java.util.*;
class Armstrong
{
  public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  int rem,sum=0,remi;
  int original=num,order=0;
  int n =num;
while(n!=0)
{
 remi = n%10;
 order+=1;
 n/=10;
}
   while(num!=0)
    {
        rem = num%10;
        sum+=Math.pow(rem,order);
        num = num/10;
    }
  if(sum==original)
    {
      System.out.println("Armstrong number");
    }
  else
    {
       System.out.println("not a Armstrong number");
    }
}
}
