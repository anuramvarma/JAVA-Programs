// Reverse an Array
// You are given an array of integers arr[]. 
//You have to reverse the given array.
// Note: Modify the array in place.
// Examples:
// Input: arr = [1, 4, 3, 2, 6, 5]
// Output: [5, 6, 2, 3, 4, 1]
// Explanation: The elements of the array are [1, 4, 3, 2, 6, 5]. 
//After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on. 
//Hence, the answer is [5, 6, 2, 3, 4, 1].


import java.util.Arrays;
public class ReverseOfArray {
    public static void main(String[] args) {
        int arr[]={1,5,3,6,2,4};
        System.out.println(Arrays.toString(arr));
        int n =arr.length;
        int start =0, end=n-1;
        while(start<end){
            int temp=arr[start];
           arr [start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]);
        // }

        System.out.println("\n"+Arrays.toString(arr));
    }
}
