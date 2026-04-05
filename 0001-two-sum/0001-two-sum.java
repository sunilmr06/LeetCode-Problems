class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            int conponent = target - nums[i];
            if(map.containsKey(conponent))
            {
                return new int[] {map.get(conponent), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}