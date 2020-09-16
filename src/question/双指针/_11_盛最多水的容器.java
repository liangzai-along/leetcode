package question.双指针;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/16 19:48
 * 地址：https://leetcode-cn.com/problems/container-with-most-water/submissions/
 */
public class _11_盛最多水的容器 {
    // 双指针暴力遍历
    public int maxArea(int[] height) {
        // 边界判断
        if (height == null || height.length < 2) return 0;
        // 左右指针
        int left = 0;
        int right = height.length-1;
        int s = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            s = Math.max(s, (right-left) * h); // 迭代面积
            // 更新高
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return s;
    }
}
