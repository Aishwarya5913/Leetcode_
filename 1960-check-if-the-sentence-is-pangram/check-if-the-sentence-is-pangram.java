class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] f = new int[26];
        int k =0;
        Arrays.fill(f,0);
        for(int i =0;i<sentence.length();i++){
            f[(int)(sentence.charAt(i))-97] ++;
        }
        for(int i =0;i<26;i++){
            if(f[i]==0)
            {
                k++;
                break;
            }
                
        }
        return k==0;
    }
}