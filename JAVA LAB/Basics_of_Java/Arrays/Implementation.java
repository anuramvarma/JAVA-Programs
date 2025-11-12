import java.util.*;
class Implementation
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.print("Enter size of Array : ");
        size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter elements in Array : ");
        int i;
        for(i =0 ;i<a.length;i++) 
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            System.out.printf("%2d",a[i]);
        }
    }
}
