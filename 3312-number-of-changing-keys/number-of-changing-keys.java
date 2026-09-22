class Solution {
    public int countKeyChanges(String s) {
        int k =0;
        String x = s.toLowerCase();
        for(int i =0;i<s.length()-1;i++){
            if(x.charAt(i)!=x.charAt(i+1))
                k++;
        }
        return k;
    }
}