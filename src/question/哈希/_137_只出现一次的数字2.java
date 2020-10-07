package question.哈希;

import java.util.Arrays;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/10/7 20:35
 * 地址：https://leetcode-cn.com/problems/single-number-ii/submissions/
 */
public class _137_只出现一次的数字2 {

    // 思路：先排序，然后土办法，毫无优雅可言
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length-1) {
            if (nums[i] == nums[i+1]) {
                i += 3;
            } else {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
