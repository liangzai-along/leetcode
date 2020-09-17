package question.双指针;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/17 19:32
 * 地址：lintcode443
 */

import java.util.Arrays;

/**
 * 给一组整数，问能找出多少对整数，他们的和大于一个给定的目标值1
 */
public class _443_两数之和2 {

    public int twoSum2 (int[] nums, int target) {
        if (nums == null || nums.length < 2) return 0;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int count = 0;
        while (left < right) {
            if (nums[left] + nums[right] < target) {
                left++;
            } else {
                // 一个数有right-left种
                count += right-left;
                right--;
            }
        }
        return count;
    }
}
