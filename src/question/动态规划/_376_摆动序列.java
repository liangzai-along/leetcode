package question.动态规划;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/25 20:19
 * 地址：https://leetcode-cn.com/problems/wiggle-subsequence/submissions/
 */
public class _376_摆动序列 {
    // 思路：动态规划
    public int wiggleMaxLength(int[] nums) {
        int len = nums.length;
        if (len < 2) return len;
        // 状态定义
        int[] up = new int[len], down = new int[len];
        up[0] = down[0] = 1;
        // 状态转移方程
        for (int i = 1; i < len; i++) {
            if (nums[i] > nums[i-1]) {
                up[i] = down[i-1] + 1;
                down[i] = down[i-1];
            } else if (nums[i] < nums[i-1]) {
                down[i] = up[i-1] + 1;
                up[i] = up[i-1];
            } else {
                up[i] = up[i-1];
                down[i] = down[i-1];
            }
        }
        return Math.max(up[len-1], down[len-1]);
    }
}
