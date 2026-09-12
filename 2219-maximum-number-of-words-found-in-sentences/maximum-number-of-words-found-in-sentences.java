class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int count =0, maxcount =0;
        for(int i=0; i<n;i++){
            for(int j =0; j<sentences[i].length();j++)
            {
                if(sentences[i].charAt(j)==' ')
                    count++;
            }
            count++;
            if(maxcount<=count)
                maxcount = count;
            count = 0;
        }
        return maxcount;
    }
}