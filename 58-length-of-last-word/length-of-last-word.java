class Solution {
    public int lengthOfLastWord(String s) {
        int k = s.length();
        int x = 0;
        int a =0;
        if(k==1||(k==2&&s.charAt(1)==' '))
            x = 1;
        else{
        while(k>1)
        {
            if(s.charAt(k-1)!=' ')
            {    x++;
                if(s.charAt(k-2)==' ' )
                 {  
                    break;}
                 if( k-2 == 0)
                 {   x++;
                 break;}
                 
            }
            k--;
        }}
    return x;
    }
}