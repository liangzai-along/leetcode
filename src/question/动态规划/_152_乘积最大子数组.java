package question.动态规划;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/24 19:53
 * 地址：https://leetcode-cn.com/problems/maximum-product-subarray/submissions/
 */
public class _152_乘积最大子数组 {
    // 思路：
    // 动态规划，状态定义，状态转移方程
    public int maxProduct(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        // 状态定义,dp[i][0]：最小，dp[i][1]：最大
        int[][] dp = new int[len][2];
        dp[0][0] = nums[0];
        dp[0][1] = nums[0];
        for (int i = 1; i < len; i++) {
            // 状态转移方程
            if (nums[i] > 0) {
                dp[i][0] = Math.min(dp[i-1][0] * nums[i], nums[i]);
                dp[i][1] = Math.max(dp[i-1][1] * nums[i], nums[i]);
            } else {
                dp[i][0] = Math.min(dp[i-1][1] * nums[i], nums[i]);
                dp[i][1] = Math.max(dp[i-1][0] * nums[i], nums[i]);
            }

        }
        int res = dp[0][1];
        for (int i = 1; i < len; i++) {
            res = Math.max(res, dp[i][1]);
        }
        return res;
    }
}
