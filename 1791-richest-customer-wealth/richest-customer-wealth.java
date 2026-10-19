class Solution {
    public int maximumWealth(int[][] accounts) {
        int r = accounts.length;
        int c = accounts[0].length;
        int sum,max=0;
        for(int i =0;i<r;i++){
            sum = 0;
            for(int j =0;j<c;j++){
                sum = sum + accounts[i][j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}