package question.双指针;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/17 21:51
 * 地址：https://leetcode-cn.com/problems/move-zeroes/submissions/
 */
public class _283_移动零 {
    // 思路：用一个指针来记录非零元素的位置
    public void moveZeroes(int[] nums) {

        int left = 0;//记录非0的指针
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
