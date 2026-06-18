class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        
        int y = x;
        
        int z = 0;
        while(x > 0){
            int r = x % 10;
            z =  z*10 + r;
            x /= 10;
        }
        if(y == z){
            return true;
        }
        else{
            return false;
        }

    }
}