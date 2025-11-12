import java.util.*;
class Precedence
{
	public static void main(String []args)
{
		float a = 12*4*2/1+2;
		boolean b = 12*4*(1+2)>=10;
		System.out.println("12*4*2/1+2: "+a);
		System.out.println("12*4*(1+2)>=10: "+b);
	}
}
