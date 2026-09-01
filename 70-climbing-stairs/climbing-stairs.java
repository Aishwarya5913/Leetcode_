class Solution {
    public int climbStairs(int n) {
        int result=1;
        int sum = 1;
        for(int i =0; i<n; i++){
            int temp = result;
           result = result + sum;
           sum = temp;
        }  return sum; 
    }
}