class Solution {
    public int secondHighest(String s) {
        int digit = -1;
        int prevdigit = -1;
        int current;
        for(int i =0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                if(s.charAt(i)>digit)
                
                 {  
                     current = s.charAt(i)-48;
                     if(current > digit)
                     {
                        prevdigit = digit;
                    digit = current;
                     }
                     else if (current < digit && current > prevdigit) {
                    prevdigit = current;
                }
                    
                 }
            }
        }
        return prevdigit;
    }
}