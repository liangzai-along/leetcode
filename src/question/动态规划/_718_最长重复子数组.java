package question.动态规划;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/24 21:30
 * 地址：https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray/submissions/
 */
public class _718_最长重复子数组 {
    // 思路：
    public int findLength(int[] A, int[] B) {

        int aLen = A.length;
        int bLen = B.length;
        // 状态定义
        int[][] dp = new int[aLen+1][bLen+1];
        int res = 0;
        for (int i = 1; i <= aLen; i++) {
            for (int j = 1; j <= bLen; j++) {
                // 状态转移方程
                if (A[i-1] == B[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = 0;
                }
                res = Math.max(res, dp[i][j]);
            }
        }
        return res;
    }
}
