class Solution {
    public String winningPlayer(int x, int y) {
        int a = y/4;
        if(y<4)
            return "Bob";
        else
        {
            if(a>=x){
                if(x%2==0)
                    return "Bob";
                else
                    return "Alice";
            }
            else{
                if(a%2==0)
                    return "Bob";
                else
                    return "Alice";
            }
        }
    }
}