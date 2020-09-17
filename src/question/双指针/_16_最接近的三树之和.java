package question.双指针;

import java.util.Arrays;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/17 20:50
 * 地址：https://leetcode-cn.com/problems/3sum-closest/submissions/
 */
public class _16_最接近的三树之和 {

    // 双指针
    // 最接近，多了一个变量用来保存差值
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        int sum = nums[0]+nums[1]+nums[2];
        // 排序
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            int left = i+1;
            int right = len-1;
            while (left < right) {
                int tempSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) > Math.abs(tempSum - target)) {
                    sum = tempSum;
                }
                if (tempSum == target) {
                    return sum;
                } else if (tempSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return sum;
    }
}
