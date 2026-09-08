class Solution {
    public int maxVowels(String s, int k) {
        int c = 0;
        int n = s.length();
        for(int i =0; i<k; i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                c++;
        }   int max = c;
        for(int i =0; i<n-k; i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                c--;
            if(s.charAt(k+i)=='a'||s.charAt(k+i)=='e'||s.charAt(k+i)=='i'||s.charAt(k+i)=='o'||s.charAt(k+i)=='u')
                c++;
            if(c>max)
                max = c;
        }
        return max;
    }
}