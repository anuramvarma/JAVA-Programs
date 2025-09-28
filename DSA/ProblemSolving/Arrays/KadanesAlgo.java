class KadanesAlgo {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n =arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            currSum =currSum + arr[i];
            maxSum =Math.max(maxSum , currSum);
            
        if(currSum < 0)
           {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
