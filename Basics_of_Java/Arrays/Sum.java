import java.util.*;
class Sum 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size;
        int sum=0;
        System.out.print("Enter size of array : ");
        size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter elemnets in array : ");
        int i;
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        System.out.println("Sum : "+sum);
    }
}
