import java.util.*;
class For_each_Loop
{
public static void main(String args[])
{
  int a[]={1,2,3,4,5};
  int sum=0;
  for(int i:a)
  {
    sum+=i;
    System.out.println(i);
  }
  System.out.println("total:"+sum);
  }
  }
