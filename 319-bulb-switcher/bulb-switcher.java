class Solution {
    public int bulbSwitch(int n) {
       int on = 0;
       while((on+1)*(on+1)<=n)
            on++;
        return on;
    }
}