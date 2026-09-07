class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i, sum =0, c=0;
        int n = arr.length;
        for(i=0;i<k;i++)
        {
            sum = sum + arr[i];
        }
        
        if((double)(sum/k)>=threshold) c++;

        for(i =0; i<n-k; i++){
            sum = sum-arr[i]+arr[k+i];
            if((double)(sum/k)>=threshold) c++;
        }
        return c;
    }
}