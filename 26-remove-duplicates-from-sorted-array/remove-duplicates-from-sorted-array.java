class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int x = n;
        for(int i =0;i<n-1;i++){
            if(nums[i]==nums[i+1])
             {   x--;
                 nums[i] = 100;
             }

        }
        Arrays.sort(nums);
        return x;
    }
}