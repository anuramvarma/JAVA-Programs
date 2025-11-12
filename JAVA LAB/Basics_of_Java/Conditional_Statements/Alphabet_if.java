import java.util.*;
class Alphabet_if
{
public static void main(String args[])
{
	char c;
	System.out.println("Enter a Character to check vowel or consonant : ");
	Scanner sc =new Scanner(System.in);
	c=sc.next().charAt(0);
	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){
	System.out.println("It is a Vowel");
	}
	else
  {
   	System.out.println("It is a Consonant");
	}
	}
	}
