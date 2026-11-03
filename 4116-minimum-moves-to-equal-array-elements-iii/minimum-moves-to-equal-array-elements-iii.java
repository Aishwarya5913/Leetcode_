class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            sum = sum + Math.abs(nums[i]-nums[n-1]);
        }
        return sum;
    }
}