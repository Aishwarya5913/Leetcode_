class Solution {
    public int xorOperation(int n, int start) {
        int x =0, result = start+(2*0);
        for(int i =1; i<n; i++){
            x = start+(2*i);
            result = result ^ x;
        }
        return result;
    }
}