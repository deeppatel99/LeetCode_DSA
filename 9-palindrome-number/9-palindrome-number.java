class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int res = 0;
        
        if(x < 0) return false;
        
        while(x != 0){
            res = res*10 + x % 10;
            x /= 10;
        }
        

        
        return (temp == res);
    }
}