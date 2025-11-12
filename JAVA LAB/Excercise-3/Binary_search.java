//USING FUNCTIONS
import java.util.*;
class Binary_search
{
static void sort(int a[],int n)
{
	int temp;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
}
static int Binarysearch(int a[],int n,int key)
{
	
        int start=0,end=n-1,pos=-1;
        while(start<=end)
        {
        	int mid=(start+end)/2;
        	if(a[mid]==key)
        	{
        		pos = mid+1;
        		break;
        	}
        	else if(key<a[mid])
        	{
        		end = mid-1;
        	}
        	else
        	{
        		start = mid+1;
        	}
        }
        if(pos>0)
        {
        	System.out.println("Key is found at "+pos);
        }
        else
        {
        	System.out.println("Key is not found");
        }
        return pos;
}
public static void main(String []args)
{
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array: ");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("Enter elements in  array : ");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	sort(a,n);
	System.out.printf("Sorted Array : ");
	for(int i=0;i<n;i++)
	{
	  System.out.printf("%d ",a[i]);
	}
        System.out.printf("\nEnter a key : ");
        int key = sc.nextInt();
        Binarysearch(a,n,key);
        
}       
}
