class Solution {
    void swap(int nums[],int a, int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    int partition(int nums[], int lb, int ub){
        
        int pivot = nums[lb+(ub-lb)/2];
        int left = lb;
        int right = ub;
        while(left<=right){
            while(nums[left]<pivot){
             left++;}
            while(nums[right]>pivot){
             right--;}
            if(left<=right)
            { swap(nums,left,right);
              left++;
              right--;}
        }
        return left;

    }
    void quickSort(int nums[], int lb, int ub){
        if(lb<ub){
            int p = partition(nums, lb, ub);
            quickSort(nums,lb,p-1);
            quickSort(nums,p,ub);
        }
    }
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0 , nums.length -1);
        return nums;
    }
}