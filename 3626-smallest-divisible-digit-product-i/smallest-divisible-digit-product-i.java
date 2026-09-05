class Solution {
    public int smallestNumber(int n, int t) {
        int prod = 1; 
        int num = n;  
        int k;    
        if (t==1){
            return n;
        }
        else{
        while(prod%t!=0)
        {
            prod = 1;
            k = num;
             while(k!=0)
        {
            prod = prod*(k%10);
            k = k/10;
        }
        num ++;
        }
        return num-1;
        }
    }
}