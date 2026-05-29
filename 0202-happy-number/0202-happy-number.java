class Solution {
    public boolean isHappy(int n) {
        int first = n;
        int second = n;

        do{
            first = nextnum(first);
            second = nextnum(nextnum(second));
        } while(first != second);
        return first == 1;
    }

    private int nextnum(int n){
        int total = 0;
        while(n > 0){
            int d = n % 10;
            total += d*d;
            n = n/10;
        }
        return total;
    }
}