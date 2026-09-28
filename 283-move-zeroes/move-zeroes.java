class Solution {
    public void swap(int[] nums,int a,int b)
    {
            int temp = nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
    }
    public void moveZeroes(int[] nums) {
      int n = nums.length;
      int l = 0;
      for(int r =0;r<n;r++)
      {
        if(nums[r]!=0)
        {
            swap(nums,l,r);
            l++;
        }
      }
        
    }
}