package question.查找;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/30 14:23
 * 地址：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class _34_在有序数组中查找元素的第一个和最后一个位置 {
    // 思路：有序，二分法
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (nums[mid] == target) {
                while (nums[left] != target) left++;
                while (nums[right] != target) right--;
                return new int[] {left, right};
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return new int[] {-1,-1};
    }
}
