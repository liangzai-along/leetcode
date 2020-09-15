package question.双指针;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/15 16:28
 * 地址：https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 */
public class _21_调整数组顺序使奇数位于偶数前面 {
    // 思路：双指针
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            while (left < right && !isEven(nums[left])) {
                left++;
            }
            while (left < right && isEven(nums[right])) {
                right--;
            }
            swap(nums, left, right);
        }
        return nums;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }
}
