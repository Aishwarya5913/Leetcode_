class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int l = 0,r = 1;
        int x;
        Arrays.sort(nums);
        if(n!=1 && nums[n-1]!=nums[n-2])
            x = nums[n-1];
        else
            x = nums[0];
    
        for(int i =0;i<n-2;i=i+2)
        {
            if(nums[i]!=nums[i+1])
            {   x = nums[i];
                break;
            }
        }
            return x;

    }
}