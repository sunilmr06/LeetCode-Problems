class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> window = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long current = (long) nums[i];

            Long floorCandidate = window.ceiling(current - valueDiff);

            if (floorCandidate != null && floorCandidate <= current + valueDiff) {
                return true;
            }

            window.add(current);

            if (i >= indexDiff) {
                window.remove((long) nums[i - indexDiff]);
            }
        }
        return false;
    }
}