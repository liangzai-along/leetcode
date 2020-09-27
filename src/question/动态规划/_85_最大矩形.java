package question.动态规划;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/27 15:50
 * 地址：https://leetcode-cn.com/problems/maximal-rectangle/submissions/
 */
public class _85_最大矩形 {
    // 动态规划
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int area = 0;
        // 状态定义，每个点的最大长度
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = j == 0 ? 1 : dp[i][j-1] + 1;
                }
                int wide = dp[i][j];
                // 计算这个为低角，最大面积
                for (int k = i; k >= 0; k--) {
                    wide = Math.min(wide, dp[k][j]);
                    area = Math.max(area, wide * (i-k+1));
                }
            }
        }
        return area;
    }
}
