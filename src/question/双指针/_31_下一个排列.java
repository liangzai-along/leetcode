package question.双指针;

import java.util.Arrays;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/17 20:52
 * 地址：https://leetcode-cn.com/problems/next-permutation/
 */
public class _31_下一个排列 {
    // 思路：两个指针从后往前扫，如果找到后面比前面的大，则交换顺序，剩下的就进行排列
    public void nextPermutation(int[] nums) {
        int pleft = nums.length-2;
        int pright = nums.length-1;
        for (int i = pleft; i >= 0; i--) {
            for (int j = pright; j > i; j--) {
                if (nums[j] > nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    Arrays.sort(nums, i+1, nums.length);
                    return;
                }
            }
        }
        Arrays.sort(nums);
    }

}
