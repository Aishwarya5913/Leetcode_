class Solution {
    public int maxVowels(String s, int k) {
        int c = 0;
        int n = s.length();
        for(int i =0; i<k; i++){
            if(isVowel(s.charAt(i)))
                c++;
        }   int max = c;
        for(int i =0; i<n-k; i++){
            if(isVowel(s.charAt(i)))
                c--;
            if(isVowel(s.charAt(k+i)))
                c++;
            if(c>max)
                max = c;
        }
        return max;
    }
    private boolean isVowel(char letter)
    {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }
    
}