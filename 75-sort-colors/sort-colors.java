class Solution {
    public void sortColors(int[] nums) {
        int a = 0, b = 0, c = 0, l, i;
        l = nums.length;
        for (i = 0; i < l; i++) {
            if (nums[i] == 0)
                a++;
            else if (nums[i] == 1)
                b++;
            else
                c++;

        }
        for (i = 0; i < l; i++) {
            if (i < a)
                nums[i] = 0;
            else if (i < a + b)
                nums[i] = 1;
            else
                nums[i] = 2;
        }
        for(i=0;i<l;i++)
            {
                   System.out.print(nums[i]+" \n");
            }
    }
}