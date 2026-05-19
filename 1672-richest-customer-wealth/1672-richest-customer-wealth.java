class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwelth =0;
        for(int i=0; i<accounts.length; i++)
        {
            int currentCos = 0;
            for(int j=0; j< accounts[i].length; j++)
            {
                currentCos += accounts[i][j]; 
            }
            maxwelth = Math.max(currentCos, maxwelth);
        }
        return maxwelth;
    }
}