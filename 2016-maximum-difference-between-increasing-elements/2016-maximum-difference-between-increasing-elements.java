class Solution {
    public int maximumDifference(int[] nums) {
        int maxdiff = -1;

        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[i] < nums[j])
                {
                    int mindiff = nums[j] - nums[i];
                    maxdiff = Math.max(mindiff, maxdiff);
                }
            }
        }
        return maxdiff;
    }
}