/*import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        int n = arr.length;
        d = d % n;
        for (int r = 0; r < d; r++) 
        {
          int temp = arr[0]; 
            for (int i = 1; i < n; i++) 
            {
                arr[i - 1] = arr[i];
            }
            arr[n - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}*/
class RotateAnArray {
    // Function to rotate an array by d elements in counter-clockwise direction.(left Rotation)
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n; // In case d > n

        // Step 1: Reverse first d elements
        reverse(arr, 0, d - 1);
        // Step 2: Reverse remaining n-d elements
        reverse(arr, d, n - 1);
        // Step 3: Reverse the whole array
        reverse(arr, 0, n - 1);
//----------------------------------------------------------------------------------------------
        // Function to rotate an array by d elements in clockwise direction.(Right Rotation)
        //     // Step 1: Reverse the whole array
        // reverse(arr, 0, n - 1);
        // // Step 2: Reverse first k elements
        // reverse(arr, 0, k - 1);
        // // Step 3: Reverse the remaining n-k elements
        // reverse(arr, k, n - 1);
    }

    // Utility function to reverse array portion
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        rotateArr(arr, d);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

}
