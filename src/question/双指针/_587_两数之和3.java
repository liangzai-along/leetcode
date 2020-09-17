package question.双指针;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/17 19:50
 * 地址：lintcode587
 */

import java.util.Arrays;

/**
 * 给一个整数数组，找出数组中有多少组不同的元素对，有相同的和，且和为给出的target值，返回对数
 */
public class _587_两数之和3 {

    public int twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) return 0;
        Arrays.sort(nums); // 排序
        int count = 0;
        int left = 0, right = nums.length-1;
        while (left < right) {
            int tempSum = nums[left] + nums[right];
            if (tempSum == target) {
                count++;
                left++;
                right--;
                // 排序后可以用循环来判断相同解： 核心
                while (left < right && nums[right] == nums[right+1]) {
                    right--;
                }
                while (left < right && nums[left] == nums[left-1]) {
                    left++;
                }
            } else if (tempSum > target) {
                right--;
            } else {
                left++;
            }
        }
        return count;
    }
}
