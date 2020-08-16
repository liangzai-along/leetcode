package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/16 15:13
 * 地址：https://leetcode-cn.com/problems/maximum-subarray/
 */
public class _53_最大子序和 {

    public int maxSubArray(int[] nums) {
        // 贪心
        //    if (nums == null || nums.length == 0) return 0;
        //    int ans = nums[0];
        //    int sum = 0;
        //    for (int i = 0; i < nums.length; i++) {
        //        if (sum > 0) {
        //            sum += nums[i];
        //        }else {
        //            sum = nums[i];
        //        }
        //        ans = Math.max(ans, sum);
        //    }
        //    return ans;
        //}

        //    动态规划
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        return max;
    }
}
