package question.递归;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/23 9:59
 * 地址：https://leetcode-cn.com/problems/3sum-closest/submissions/
 */
public class _16_最接近的三数之和 {
    // 暴力解法======> 优化
    public int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        int diff = 0;
        int min = 10000;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    diff = (sum-target) > 0 ? sum - target : target - sum;
                    if (diff < min) {
                        min = diff;
                        res = sum;
                    }
                }
            }
        }
        return res;
    }
}
