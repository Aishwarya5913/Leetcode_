class Solution {
    public int bulbSwitch(int n) {
        int i =1, on =-1,k=0;
        if(n==0)
            return 0;
        
        else{
            while(k<=n){
                k =(int) (Math.pow(i,2));
                on++;
                i++;
            }
            return on;
        }
    }
}