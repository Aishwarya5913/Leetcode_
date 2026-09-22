class Solution {
    public int firstUniqChar(String s) {
        int index = -1;
        int k =-1;
        int j =0;
        for(int i =0;i<s.length();i++){
            j=0;
            k=-1;
            while(j<s.length()){
                if(s.charAt(i)==s.charAt(j))
                {
                    k++;
                    if(k>0)
                        break;
                    
                }
                j++;
            }
            if(k==0)
             {   index = i;
                break;
             }
        }
        return index;
    }
}