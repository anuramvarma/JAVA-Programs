
import java.util.*;
class Alphabet_switch 
{
    public static void main (String args[]) 
  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a alphabet to check either it is vowel or consonant:");
        char c=sc.next().charAt(0);
        switch(c) 
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':System.out.println("It is a Vowel");
                    break;
            default :System.out.println("It is a Consonant");
                    break;

        } 
    }
}
