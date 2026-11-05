class Solution {
    public int countElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i = 1; i<nums.length; i++){
            min = Math.min(nums[i], min);
            max = Math.max(nums[i],max);
        }

        int count = 0;
        for(int num : nums){
            if(num > min && num < max){
                count ++;
            }
        }
        return count;
    }
}