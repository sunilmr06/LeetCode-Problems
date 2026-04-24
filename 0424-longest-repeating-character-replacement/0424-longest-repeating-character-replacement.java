class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26];
        int left = 0;
        int max = 0;
        int maxLength = 0;

        for(int i=0; i<s.length(); i++)
        {
            int currentIndex = s.charAt(i) - 'A';
            counts[currentIndex]++;
            max = Math.max(max, counts[currentIndex]);

            while((i - left +1) - max > k)
            {
                counts[s.charAt(left) - 'A']--;
                left++;
            } 
            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }
}