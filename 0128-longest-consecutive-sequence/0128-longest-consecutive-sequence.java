class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> ans = new HashSet<>();

        for(int num : nums)
        {
            ans.add(num);
        }
        int longest = 0;

        for(int num : ans)
        {
            if(!ans.contains(num -1))
            {
                int currentNum = num;
                int count =1;
                while (ans.contains(currentNum + 1))
                {
                    currentNum++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}