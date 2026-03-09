class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum = nums[0];
        int maxsum = nums[0];

        for(int i=1; i<nums.length; i++)
        {
            currentsum += nums[i];
            if(currentsum < nums[i])
            {
                currentsum = nums[i];
            }
            if(maxsum < currentsum)
            {
                maxsum = currentsum;
            }
        }
        return maxsum;
    }
}