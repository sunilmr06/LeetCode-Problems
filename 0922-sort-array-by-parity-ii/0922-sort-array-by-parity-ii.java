class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even= 0, odd = 1;
        int n = nums.length;

        while(even < n && odd < n){
            if(nums[even] % 2 == 0){
                even = even + 2;
            }
            else if(nums[odd] % 2 == 1){
                odd = odd + 2;
            }
            else {
                int temp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = temp;
                even += 2;
                odd += 2;
            }
        }
        return nums;
    }
}