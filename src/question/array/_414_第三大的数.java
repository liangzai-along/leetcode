package question.array;

import java.util.Arrays;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/29 14:27
 * 地址：https://leetcode-cn.com/problems/third-maximum-number/
 */
public class _414_第三大的数 {

    // 思路1：一般思路：排序，然后取数，用一个变量来存储是都第三这个信息
    //
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int res = nums[nums.length-1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < res) {
                res = nums[i];
                count++;
            }
            if (count == 2) {
                break;
            }

        }
        return count == 2 ? res : nums[nums.length-1];
    }
}
