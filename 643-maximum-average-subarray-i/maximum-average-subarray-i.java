class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum =0;
        for(int i =0; i<k;i++){
            sum = sum + nums[i];
        }
        double Maxavg = sum/k;
        double avg ;
        for(int j =0; j<nums.length-k; j++){
            sum = sum - nums[j]+nums[j+k];
            Maxavg = Math.max(Maxavg, sum/k);
            }
        
        return Maxavg;
    }
}