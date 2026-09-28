class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int[] result = new int[n];
        int[] lsum = new int[n];
        int[] rsum = new int[n];
        int sum1 = 0, sum2 = 0;
        for(int i =0;i<n;i++)
        {
            lsum[i]=sum1;
            sum1 = sum1 + nums[i];
            rsum[n-1-i]=sum2;
            sum2 = sum2 + nums[n-1-i];
        }
        for(int i =0;i<n;i++)
        {
            result[i]=Math.abs(lsum[i]-rsum[i]);
        }
        return result;

    }
}