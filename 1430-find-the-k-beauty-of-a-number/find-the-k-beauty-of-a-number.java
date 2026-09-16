class Solution {
    public int divisorSubstrings(int num, int k) {
        int c =0;
        int n = num%(int)(Math.pow(10,k));
        int power = 10;
        int l= String.valueOf(num).length();
        if(n!=0)
        {    
            if(num%n==0)
                c++;
        }
        
        for(int i =0;i<l-k;i++)
        {  n = (num / power) % (int)Math.pow(10,k);

            if(n != 0 && num % n == 0)
                c++;
            power = power*10;
               
        }
        return c;
    }
}