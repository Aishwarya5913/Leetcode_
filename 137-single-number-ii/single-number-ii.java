class Solution {
    public int singleNumber(int[] nums) {
        int l = nums.length;
        int x ;
        int i ;
        Arrays.sort(nums);
        if(l==1 || nums[0]!=nums[1])
            x = nums[0];
        else 
        {   x = nums[l-1];
            for(i = 0;i<l-1;i=i+3){
                if(nums[i]!=nums[i+1])
                {
                    x = nums[i];
                    break;
                }
            }
        }
        return x;
    }
}