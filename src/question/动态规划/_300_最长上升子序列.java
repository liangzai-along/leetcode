package question.动态规划;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/25 19:49
 * 地址：https://leetcode-cn.com/problems/longest-increasing-subsequence/
 */
public class _300_最长上升子序列 {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len < 2) return len;
        // 状态定义,关键字是：以第 i 个数字为结尾，即我们要求 nums[i] 必须被选取
        // 反正一个子序列一定要以一个数字结尾，那我就将状态这么定义，这一点是重要且常见的
        int[] dp = new int[len];
        dp[0] = 1;
        int res = 1;
        for (int i = 1; i < len; i++) {
            int temp = 0;
            for (int j = 0; j < i; j++) {
                // 求max(dp[j])
                if (nums[i] > nums[j]) {
                    temp = Math.max(temp, dp[j]);
                }
            }
            // 一定以一个数字结尾，所以状态转移方程等于max(dp[j]) + 1;
            dp[i] = temp + 1;
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
