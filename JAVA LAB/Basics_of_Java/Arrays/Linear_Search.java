import java.util.*;
class Linear_Search
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int i,key,pos=-1;
        int size;
        System.out.print("Enter size of array :");
        size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter elements in array");
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.print("Enter a Key : ");
        key=sc.nextInt();
        for(i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                pos=i+1;
                break;
            }

        }
        if(pos>0)
        {
            System.out.println("Key is found at : "+pos);
        }
        else
        {
            System.out.println("Key is not found ");
        }
    }
}
