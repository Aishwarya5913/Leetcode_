class Solution {
    public String toLowerCase(String s) {
        char[] result = s.toCharArray();
        for(int i =0; i<result.length;i++){
            if('A'<=result[i]&&result[i]<='Z')
                result[i]= (char) (result[i]-'A'+'a');

        }
        return new String(result);
    }
}