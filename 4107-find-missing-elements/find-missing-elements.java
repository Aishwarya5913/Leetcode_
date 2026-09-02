class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> num = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]+1!=nums[i+1])
            {
                for(int j=1;j<nums[i+1]-nums[i];j++)
                 num.add(nums[i]+j);
            }
               
        }
        return num;
    }
}