class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int sum =0; int sum2 =0, num ;
        for(int i =0; i<n; i++){
            sum = sum + nums[i];
        }
        for(int i =0; i<n; i++){
            num = nums[i];
            while(num>0){
                sum2 = sum2 + (num%10);
                num = num/10;
            }
        }
        return Math.abs(sum-sum2);
    }
}