class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        
        if (n1 > n2) return false;

        int[] s1Counts = new int[26];
        int[] windowCounts = new int[26];

        // Step 1: Initialize the frequency for s1 and the first window of s2
        for (int i = 0; i < n1; i++) {
            s1Counts[s1.charAt(i) - 'a']++;
            windowCounts[s2.charAt(i) - 'a']++;
        }

        // Step 2: Slide the window
        for (int i = 0; i < n2 - n1; i++) {
            if (matches(s1Counts, windowCounts)) return true;

            // Slide: Remove the character going out (left) and add the one coming in (right)
            windowCounts[s2.charAt(i + n1) - 'a']++;
            windowCounts[s2.charAt(i) - 'a']--;
        }

        // Check the very last window
        return matches(s1Counts, windowCounts);
    }

    // Helper method to compare two frequency arrays
    private boolean matches(int[] s1Counts, int[] windowCounts) {
        for (int i = 0; i < 26; i++) {
            if (s1Counts[i] != windowCounts[i]) return false;
        }
        return true;
    }
}