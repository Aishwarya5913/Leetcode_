class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int p[] = new int[n+1];
        int s[] = new int[n];
        p[0]=0;
        s[n-1]=nums[n-1];
        for(int i =0; i<n; i++){
            p[i+1]=p[i]+nums[i];
        }
        for(int i = n-2; i>=0;i--){
            s[i]=s[i+1]+nums[i];
        }
        for(int i = 0; i<n; i++){
            int lsum=p[i];
            int rsum = s[i]-nums[i];
            if(lsum==rsum)
                return i;
        }
        return -1;
    }
}