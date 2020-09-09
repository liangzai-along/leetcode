package question.动态规划;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/9 10:12
 * 地址：https://leetcode-cn.com/problems/three-steps-problem-lcci/
 */
public class _0801_三步问题 {
    public int waysToStep(int n) {
        if(n <= 2) return n;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;
        for(int i = 3; i < n; i++){
            //取模，对两个较大的数之和取模再对整体取模，防止越界（这里也是有讲究的）
            //假如对三个dp[i-n]都 % 1000000007，那么也是会出现越界情况（导致溢出变为负数的问题）
            //因为如果本来三个dp[i-n]都接近 1000000007 那么取模后仍然不变，但三个相加则溢出
            //但对两个较大的dp[i-n]:dp[i-2],dp[i-3]之和mod 1000000007，那么这两个较大的数相加大于 1000000007但又不溢出
            //取模后变成一个很小的数，与dp[i-1]相加也不溢出
            //所以取模操作也需要仔细分析
            dp[i] = ((dp[i - 3] + dp[i - 2]) % 1000000007 + dp[i - 1]) % 1000000007;
        }
        return dp[n - 1];
    }
}
