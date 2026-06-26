class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int componet = target - nums[i];
            if(map.containsKey(componet)){
                return new int[] {map.get(componet),i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
