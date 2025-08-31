// Move All Zeroes to End
// Difficulty: EasyAccuracy: 45.51%Submissions: 377K+Points: 2Average Time: 15m
// You are given an array arr[] of non-negative integers. You have to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.

// Examples:

// Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
// Output: [1, 2, 4, 3, 5, 0, 0, 0]


import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {
        int arr[]={20,1,0,0,36,0,42,8,4,};

        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
        if(arr[i]!=0){
            arr[count++]=arr[i];
        }
    }
        while(count<n){
        arr[count++]=0;
    }
    for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    System.out.println(" ");
    System.out.println(Arrays.toString(arr));
    }
}
