class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        
       int reverse = 0;
        int real = x;
        while(real != 0){
            int remainder = real % 10;
            reverse = reverse * 10 + remainder;
            real = real/10;
        }
        
        return x == reverse;
    }
}