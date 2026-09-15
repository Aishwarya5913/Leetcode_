class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        int min =nums[n-1]-nums[n-k],i;
        
        for(i=1;i<n-k+1;i++){
            if((nums[n-1-i]-nums[n-k-i])<min)
                min = nums[n-1-i]-nums[n-k-i];
        }
        return min;
    }
}