import java.util.*;
class Factorial
{
public static void main(String args[])
{
	int i;
	int num;
	int f=1;
	System.out.print("Enter a number=");
	Scanner obj=new Scanner(System.in);
	num=obj.nextInt();
	System.out.println("Factorial of "+num+" "+"=");
	for(i=1;i<=num;i++)
	{
		f*=i;
	}
	System.out.println(f);
}	
}
