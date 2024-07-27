import java.util.*;
class Quadratic_Roots
{
   public static void main(String args[])
{
 int a;
 int b;
 int c;
 double root1;
 double root2;
 System.out.println("Enter a,b,c:");
 Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt(); 
  int d=(b*b)-(4*a*c);
  if(d>0)
  {
	  root1=(-b+Math.sqrt(d))/(2*a);
	  root2=(-b-Math.sqrt(d))/(2*a);
	  System.out.println("The Roots are real and distinct");
    System.out.println("Root1="+root1);
    System.out.println("Root2="+root2);
  }
    else if (d==0)
    {
	   root1=root2=(-b/(2*a));
	   System.out.println("The roots are equal");
	   System.out.format("Root1=%.2f\n",root1);
     System.out.format("Root2=%.2f\n",root2);
    }
     else
      {
	     double real=(-b/2*a);
	     double imaginary=(Math.sqrt(-d))/(2*a);
	     System.out.format("Root1=%.2f+i%.2f\n",real,imaginary);
	     System.out.format("Root2=%.2f-i%.2f\n",real,imaginary);
      }
  }
}
