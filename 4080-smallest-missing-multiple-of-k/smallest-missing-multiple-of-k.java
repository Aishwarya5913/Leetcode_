class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int c=1;
        for ( int i = 0; i < nums.length; i++)
        {
                if(nums[i]==k*c)
                {    c++;   
                }
        }
      return k*c; 
    }
}