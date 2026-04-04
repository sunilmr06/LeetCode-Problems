import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0, right = 0;
        int formed = 0, required = map.size();

        HashMap<Character, Integer> windowMap = new HashMap<>();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while(right < s.length()) {

            char ch = s.charAt(right);
            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);

            if(map.containsKey(ch) && 
               windowMap.get(ch).intValue() == map.get(ch).intValue()) {
                formed++;
            }

            while(left <= right && formed == required) {

                if(right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if(map.containsKey(leftChar) && 
                   windowMap.get(leftChar) < map.get(leftChar)) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" 
               : s.substring(start, start + minLen);
    }
}