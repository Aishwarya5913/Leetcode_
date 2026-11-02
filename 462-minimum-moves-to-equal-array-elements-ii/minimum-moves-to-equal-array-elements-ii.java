class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);
        int median = nums[n/2];
        
        int r = 0;
        for(int i =0;i<n;i++)
        {
            r = r + Math.abs(median - nums[i]);
        }
        return r;
    }
}