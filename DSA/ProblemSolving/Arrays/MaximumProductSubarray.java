class MaximumProductSubarray {
    int maxProduct(int[] arr) {
        // code here
        int n =arr.length;
        int ans =Integer.MIN_VALUE;
        int pre=1,suff=1;
        
        for(int i=0;i<n;i++){
            if(pre==0){
                pre=1;
            }
            if(suff==0){
                suff=1;
            }
            pre=pre*arr[i];
            suff=suff*arr[n-i-1];
            ans= Math.max(ans,Math.max(pre,suff));
            
        }
        return ans;
    }
}