class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int n = nums.length;
        int k = nums[n-1];
        for(int i =0;i<n;i++){
            sum = sum + Math.abs(nums[i]-k);
        }
        return sum;
    }
}