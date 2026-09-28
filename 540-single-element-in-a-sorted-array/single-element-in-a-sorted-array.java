class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int x =0;
        if(n==1)
            x = nums[0];
        else if(nums[n-1]!=nums[n-2])
            x = nums[n-1];
        else{for(int i =0;i<n-1;i=i+2){
            if(nums[i]!=nums[i+1] )
             {   x = nums[i];
                break;
             }

        }
        }
        return x;
    }
}