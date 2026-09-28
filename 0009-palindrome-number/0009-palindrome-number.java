class Solution {
    public boolean isPalindrome(int x) {
        int rem, rev = 0;

        if(x < 0){
            return false;
        }

        int original = x;
        while(x != 0){
            rem = x % 10; 
            rev = rev * 10 + rem;
            x = x / 10;

        }
        if(rev == original){
            return true;
        }
        return false;
    }
}