package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/29 10:44
 * 地址：https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray/
 */
public class _581_最短无序连续子数组 {
    // 双指针--左右两边同时扫
    public int findUnsortedSubarray(int[] nums) {

        int left = 1;
        int right = nums.length -2;
        int min = nums[0];
        int max = nums[nums.length -1];
        int down = 0;
        int up = 1;
        while (left <= nums.length && right >= 0) {
            if (nums[left] < min) {
                down = left;
            } else {
                min = nums[left];
            }
            if (nums[right] > max) {
                up = right;
            } else {
                max = nums[right];
            }
            left++;
            right--;
        }
        return down - up + 1;
    }
}
