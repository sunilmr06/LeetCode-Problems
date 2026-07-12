class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();

        for(int r=0; r<9; r++)
        {
            for(int c=0; c<9; c++)
            {
                char num = board[r][c];

                if(num != '.'){
                    if(!set.add(num + "found in row" + r)||
                    !set.add(num + " found in col " + c) ||
                    !set.add(num + " found in box " + (r / 3) + "-" + (c / 3)))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}