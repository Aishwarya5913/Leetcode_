class Solution {
    public boolean divisorGame(int n) {
        int c = 0;
        if(n ==1)
            return false;
        else{
            while(n!=1){
            for(int i =1; i<n; i++){
            if(n%i==0){
                c++;
                n = n-i;
                break;
            }
            }
            }
         
        if(c%2==0)
            return false;
        else
            return true;
        }
        }

    }
