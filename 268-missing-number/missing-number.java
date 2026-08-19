class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        int n = nums.length;
        for(i=0;i<n;i++){
            if(nums[i]!=i)
              break;
        }
        return i;
    }
}