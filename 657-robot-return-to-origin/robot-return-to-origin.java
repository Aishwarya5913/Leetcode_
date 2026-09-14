class Solution {
    public boolean judgeCircle(String moves) {
        int a =0, b=0;
        for(int i =0; i<moves.length();i++)
        {
            if(moves.charAt(i)=='R')
                a++;
            else if(moves.charAt(i)=='L')
                a--;
            else if(moves.charAt(i)=='U')
                b++;
            else
                b--;
        }
        if(a==0 && b==0)
            return true;
        else
            return false;
    }
}