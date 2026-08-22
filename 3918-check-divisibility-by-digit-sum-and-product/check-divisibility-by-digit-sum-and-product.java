class Solution {
    public boolean checkDivisibility(int n) {
        int sum =0; 
        int prod =1;
        int num = n;
        while(num!=0)
        {
            sum = sum + (num%10);
            prod = prod*(num%10);
            num = num/10;
        }
        return n%(sum+prod)==0;
    }
}