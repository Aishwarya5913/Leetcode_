class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i =0; i<n; i++){
            nums1[m+i]=nums2[i];
        }
        divide(nums1,0,m+n-1);
    }
    public void divide(int[] nums1, int low, int high){
        if(low<high){
            int mid = low+(high-low)/2;
            divide(nums1,low,mid);
            divide(nums1,mid+1,high);
            Merge(nums1, low, mid, high);
            
        }
    }
    public void Merge(int nums1[], int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(nums1[left]<=nums1[right]){
                temp.add(nums1[left]);
                left++;
            }
            else
            {
                temp.add(nums1[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(nums1[left]);
            left++;
        }
        while(right<=high)
        {
            temp.add(nums1[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums1[i]=temp.get(i-low);
        }
    }
} 

