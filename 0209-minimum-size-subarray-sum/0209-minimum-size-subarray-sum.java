class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int n = nums.length;
       int minLength = Integer.MAX_VALUE;
       int currentSum =  0;
       int left = 0;

       for(int i=0; i<n; i++)
       {
            currentSum += nums[i];

            while(currentSum >= target)
            {
                minLength = Math.min(minLength, i - left +1);
                currentSum -= nums[left];
                left++;
            } 
       }
       return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}