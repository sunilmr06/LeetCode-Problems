class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];

        int left = 0;
        int right = n;
        int out = 0;

        while(left < n)
        {
            ans[out] = nums[left];
            out++;
            ans[out] = nums[right];
            left++;
            right++;
            out++;
        }
        return ans;
    }
}