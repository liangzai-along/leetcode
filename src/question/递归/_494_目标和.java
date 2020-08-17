package question.递归;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/17 19:12
 * 地址：https://leetcode-cn.com/problems/target-sum/submissions/
 */

// 回溯法
public class _494_目标和 {
    int result = 0;

    public int findTargetSumWays(int[] nums, int S) {
        if (nums.length == 0) return 0;
        backtrack(nums, 0, S);
        return result;

    }

    public void backtrack(int[] nums, int i, int rest) {

        if (i == nums.length) {
            if (rest == 0) {
                result++;
            }
            return;
        }
        rest += nums[i];
        backtrack(nums, i + 1, rest);
        rest -= nums[i];

        rest -= nums[i];
        backtrack(nums, i + 1, rest);
        rest += nums[i];

    }
}
