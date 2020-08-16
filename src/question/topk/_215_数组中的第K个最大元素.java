package question.topk;

import java.util.Arrays;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/16 16:02
 * 地址：https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 */
public class _215_数组中的第K个最大元素 {
    // 排序算法
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
