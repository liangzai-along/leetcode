package question.动态规划;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/25 21:32
 * 地址：https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/submissions/
 */
public class _48_最长不含重复字符 {
    // 思路：最的子问题，动态规划
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (s == null || len == 0) return 0;
        // 状态定义,以s.charAt(i)为结尾的最长不含重复字符
        int[] dp = new int[len];
        dp[0] = 1;
        int res = 1;
        for (int i = 1; i < len; i++) {
            int j = i - 1;
            // 向前比较到前一个答案的起点位置
            while (j >= i-dp[i-1] && s.charAt(j) != s.charAt(i)) {
                j--;
            }
            dp[i] = i-j;
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
