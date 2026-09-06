class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avgs = new int[n];
        Arrays.fill(avgs,-1);
        int w = (2*k + 1);
    
        if(n<w)
            return avgs;
        else{
            long sum = 0;
            for(int i = 0 ; i<w; i++)
            {
                sum = sum + nums[i];
            }
            avgs[k]=(int)(sum/w);

            for(int i =0; i<n-w;i++){
                sum = sum - nums[i]+nums[w+i];
                avgs[k+i+1] = (int)(sum/w);
            }

            return avgs;
        }
    }       
}
