class Solution {
    public boolean isAnagram(String s, String t) {
        char[] S = s.toCharArray();
        Arrays.sort(S);
        String one = new String(S);

        char[] T = t.toCharArray();
        Arrays.sort(T);
        String two = new String(T);

        return one.equals(two);

        
    }
}