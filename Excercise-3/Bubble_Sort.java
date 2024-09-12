import java.util.*;
class Bubble_Sort
{
static void sort(int a[],int n)
{
	int t;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				t = a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
	}
}

public static void main(String []args)
{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array size:");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("Enter array elements:");
	for(int i=0;i<n;i++)
  {
	a[i]=sc.nextInt();
	}
	sort(a,n);
	System.out.println("The Sorted elements are:");
	for(int i=0;i<n;i++)
  {
	System.out.println(a[i]);
	}
}
}
