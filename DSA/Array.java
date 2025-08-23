import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array: ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.println("Enter elements in  array : ");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
    int sum =0,pro=1,max=arr[0],min=arr[0];
    
        for(int i=0;i<arr.length;i++){
            sum =sum+arr[i];
            pro =pro*arr[i];

            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(sum+" "+pro+ " "+max+" "+min);

    }
}
