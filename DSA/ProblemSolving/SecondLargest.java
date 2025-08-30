// //Second Largest
// Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
// Note: The second largest element should not be equal to the largest element.
// Examples:
// Input: arr[] = [12, 35, 1, 10, 34, 1]
// Output: 34
// Explanation: The largest element of the array is 35 and the second largest element is 34.

public class SecondLargest{
    public static void main(String[] args) {
        int arr[]={1,24,3,5,7,30,15};
        int max=arr[0],smax=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
            smax=max;
            max=arr[i];
        }
        else if (arr[i]>smax && arr[i]<max ) {
            smax=arr[i];
        }
    }
        System.out.println(max);
        System.out.println(smax);
  }
}