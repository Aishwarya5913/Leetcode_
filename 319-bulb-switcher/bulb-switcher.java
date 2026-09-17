class Solution {
    public int bulbSwitch(int n) {
        int i =1, on =-1,k=0;
        if(n==0)
            return 0;
        if(n==1||n==2||n==3)
            return 1;
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