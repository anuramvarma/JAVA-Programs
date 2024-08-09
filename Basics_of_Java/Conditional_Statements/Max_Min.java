import java.util.*;
class Max_Min 
{
    public static void main(String args[]) 
{
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a two numbers to check max and min among them:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b) 
          {
            System.out.println(a+" is max");
            System.out.println(b+" is min");
          }
        else 
          {
            System.out.println(b+" is max");
            System.out.println(a+" is min");
          }

    }
}
