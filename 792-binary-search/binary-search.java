class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0,high = n-1;
        int mid = (high-low)/2 + low;
        int result = -1;
        while(low<=high){
            mid = (high-low)/2 + low;
            if(nums[mid] == target)
            {
                result = mid;
                break;
            }
            else if(target>nums[mid])
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
            
        }
        return result;
    }
}