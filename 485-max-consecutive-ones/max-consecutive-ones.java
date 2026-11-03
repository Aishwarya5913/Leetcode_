class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int n = nums.length;
        int max = 0;
        for(int i = 0;i<n;i++){
             c++;
            if(nums[i]==0 || i == n-1)
            {   if(i==n-1 && nums[n-1]==1)
            {
                if(c>max)
                    max = c;
            }
            else{
                if(c-1>max)
                {
                    max = c-1;
                }
                c = 0;
            }
            }
             
               
        }
        return max;
    }
}