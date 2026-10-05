class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = nums.length;
        int i;
        for(i =0;i<l;i++)
        {
            if(nums[i]>=target)
                break;

        }
     
            return i;
    }
}