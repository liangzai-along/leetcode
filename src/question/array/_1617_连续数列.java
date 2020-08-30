package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/30 10:51
 * 地址：https://leetcode-cn.com/problems/contiguous-sequence-lcci/
 */
public class _1617_连续数列 {
    // 连续子问题，滑动窗口,规则是连续数组总和,其他的规则有不重复字符串,最长回文串
    // 连续数组总和规则
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // 每个节点的选择，选择自己一个，或者和上一个一起
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
