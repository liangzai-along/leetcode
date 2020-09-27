package question.动态规划;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/27 15:08
 * 地址：https://leetcode-cn.com/problems/minimum-path-sum/
 */
public class _64_最小路径和 {
    // 思路：动态规划
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // 状态定义，grid[0][0]到grid[m][n]的最小和
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        // 初始化第一行和第一列
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        // 状态转移方程
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min((dp[i-1][j]+grid[i][j]), (dp[i][j-1]+grid[i][j]));
            }
        }
        return dp[m-1][n-1];
    }
}
