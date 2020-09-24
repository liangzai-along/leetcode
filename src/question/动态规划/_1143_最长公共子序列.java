package question.动态规划;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/24 22:41
 * 地址：https://leetcode-cn.com/problems/longest-common-subsequence/submissions/
 */
public class _1143_最长公共子序列 {
    // 思路: 最长公共子序列，注意不是连续的
    //
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1 == null || text1.length() == 0 || text2 == null || text2.length() == 0) return 0;
        int len1 = text1.length();
        int len2 = text2.length();
        // 状态定义
        int[][] dp = new int[len1+1][len2+1];
        for (int i = 1; i < 1+len1; i++) {
            for (int j = 1; j < 1+len2; j++) {
                // 状态转移方程
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[len1][len2];
    }
}
