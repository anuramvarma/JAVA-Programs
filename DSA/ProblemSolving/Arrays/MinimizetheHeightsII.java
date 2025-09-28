import java.util.Arrays;
class MinimizetheHeightsII {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        if(n == 1){
            return 0;
        }
        
        Arrays.sort(arr);
        
        int ans = arr[n-1]-arr[0];
        for(int i=1;i<n;i++){
        if(arr[i]-k <0){
            continue;
            
        }
        
        int minVal = Math.min(arr[0]+k,arr[i]-k);
        int maxVal = Math.max(arr[n-1]-k,arr[i-1]+k);
        
        ans=Math.min(ans,maxVal - minVal);
        }
        return ans;
    }
}


