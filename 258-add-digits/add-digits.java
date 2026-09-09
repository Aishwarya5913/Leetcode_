class Solution {
    public int addDigits(int num) {
        int n = num, sum =0;
        while(n>9)
        {   
            sum = 0;
            while(n>0)
            {
                sum = sum + (n%10);
                n = n/10;
            }
            n = sum;
        }
        return n;
    }
}