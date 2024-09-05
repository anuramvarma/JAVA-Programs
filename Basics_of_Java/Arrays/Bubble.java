import java.util.*;
public class Bubble
{
    static void sort(int a[],int n)
  {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
    }
}
public static void main(String args[])
  {
    System.out.print("Enter size of an Array: ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter elements into Array : ");
    for(int i=0;i<a.length;i++)
    {
        a[i]=sc.nextInt();
    }
    sort(a,a.length);
    System.out.print("After sorting : ");
    for(int i=0;i<a.length;i++)
    {
        System.out.print(a[i]+" ");
    }
   }
}
