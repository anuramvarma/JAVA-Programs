class SmallestMissingPositive {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        // Step 1: Replace all invalid numbers (<=0 or >n) with n+1
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] <= 0 || arr[i] > n) 
            {
                arr[i] = n + 1;
            }
        }

        // Step 2: Place numbers in their correct positions using swapping
        for (int i = 0; i < n; i++) 
        {
            while (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) 
            {
                swap(arr, i, arr[i] - 1);
            }
        }

        // Step 3: Find the first index where number != index+1
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 4: If all numbers are in place, missing number is n+1
        return n + 1;
    }

    // Swap function
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method for testing
    public static void main(String[] args) {
        SmallestMissingPositive obj = new SmallestMissingPositive();

        int[] arr1 = {2,-3,4,1,1,7};
        System.out.println("First missing positive: " + obj.missingNumber(arr1)); 
    }
}
