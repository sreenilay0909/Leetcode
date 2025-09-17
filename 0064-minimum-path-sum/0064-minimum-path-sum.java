
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return minPath(grid, m - 1, n - 1, dp);
    }

    private int minPath(int[][] grid, int row, int col, int[][] dp) {
        if (row == 0 && col == 0) {
            return grid[row][col];
        }
        if (row < 0 || col < 0) {
            return Integer.MAX_VALUE;
        }
        if (dp[row][col] != -1) {
            return dp[row][col];
        }
        int up = minPath(grid, row - 1, col, dp);
        int left = minPath(grid, row, col - 1, dp);
        return dp[row][col] = grid[row][col] + Math.min(up, left);
    }
}