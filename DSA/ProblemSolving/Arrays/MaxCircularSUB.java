class MaxCircularSUB {
    public int maxCircularSum(int arr[]) {
        int n = arr.length;

        int totalSum = 0;

        int currentMax = 0; 
        int maxSum = Integer.MIN_VALUE;
        
        int currentMin = 0; 
        int minSum = Integer.MAX_VALUE;

        for (int num : arr) {
            // For maximum subarray sum (Kadane’s)
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);

            // For minimum subarray sum
            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);

            // Total sum of array
            totalSum += num;
        }

        // If all numbers are negative, maxSum is the answer
        if (totalSum == minSum) {
            return maxSum;
        }

        // Otherwise, take the maximum of non-wrapping and wrapping sum
        return Math.max(maxSum, totalSum - minSum);
    }

    public static void main(String[] args) {
        MaxCircularSUB sol = new MaxCircularSUB();
        int arr[] = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(sol.maxCircularSum(arr));

    }
}
