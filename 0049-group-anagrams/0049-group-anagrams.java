class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs)
        {
            int[] count = new int[26];

            for(char ch : str.toCharArray())
            {
                count[ch - 'a']++;
            }
            StringBuffer key = new StringBuffer();
            for(int num : count)
            {
                key.append(num).append("#");
            }
                String finalkey = key.toString();

                if(!map.containsKey(finalkey))
                {
                    map.put(finalkey, new ArrayList<>());
                }
                map.get(finalkey).add(str);
            }
        return new ArrayList<>(map.values());
    }
}