class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)
            return strs[0];
        else{
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        int c = 0;
        StringBuilder s = new StringBuilder();
        for(int i=0; i<strs[0].length(); i++)
        {   for(int j =0; j<strs.length-1; j++){
            if(strs[j].charAt(i)!=strs[j+1].charAt(i))
             {
                  c++;
                  break;
             }
            }
             if(c==0)
             
                s.append(strs[0].charAt(i));
             
             else
                
                break;
             
            

        }
        return s.toString();
        }
        
    }
}