class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int res = 0;
        
        if(x < 0) return false;
        
        while(x != 0){
            int remainder = x % 10;
            res = res*10 + remainder;
            x = x / 10;
        }
        

        
        if(temp == res) return true;
        
        return false;
    }
}