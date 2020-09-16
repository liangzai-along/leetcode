package question.双指针;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/16 23:09
 * 地址：https://leetcode-cn.com/problems/trapping-rain-water/submissions/
 */
public class _42_接雨水 {
    // 思路：每个数组能接的水是左边的最大值和右边的最大值中的最小值，然后减去这个点的值
    public int trap(int[] height) {
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            int maxLeft = 0;
            int maxRight = 0;
            for (int j = i; j >=0; j--) {
                maxLeft = Math.max(height[j], maxLeft);
            }
            for (int j = i; j < height.length; j++) {
                maxRight = Math.max(height[j], maxRight);
            }
            res += Math.min(maxRight,maxLeft) - height[i];
        }
        return res;
    }
}
