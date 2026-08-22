class Solution {
    public boolean checkDivisibility(int n) {
        int sum =n%10;; 
        int prod =n%10;
        int num = n/10;
        while(num>0)
        {
            sum = sum + (num%10);
            prod = prod*(num%10);
            num = num/10;
        }
        return n%(sum+prod)==0;
    }
}