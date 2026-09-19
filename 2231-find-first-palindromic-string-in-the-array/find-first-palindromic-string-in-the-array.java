class Solution {
    public String firstPalindrome(String[] words) {
        String x = "";int c =0;
        for(int i =0;i<words.length;i++ ){
            if(words[i].length()==1)
            {
                x = words[i];
                break;
            }
                c=0;
                for(int j =0; j<words[i].length()/2;j++)
                {   
                    if(words[i].charAt(j)==words[i].charAt((words[i].length())  - 1 - j))
                      c++;
                }
                
                if(c==words[i].length()/2)
                {   x = words[i];
                    break;
                }
                
            
        }
        return x;
    }
}