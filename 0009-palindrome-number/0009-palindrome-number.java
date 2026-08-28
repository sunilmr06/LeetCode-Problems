class Solution {
    public boolean isPalindrome(int x) {
        int rem,original,rev =0;

        if(x < 0)
        { 
            return false;
        }
        original = x;

        while(x != 0)
        {
            rem = x % 10;  
            rev = rev*10 + rem;
            x /= 10;
        }
        if(original == rev)
        {
            return true;
        }
        return false;
    }
}