class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0,l=nums.length;
        for(int i = 0;i<l;i++)
        {
            sum = sum + nums[i];

        }
        if(sum<k)
            return sum;
        else
            return sum%k;
    }
}