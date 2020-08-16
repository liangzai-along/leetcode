package question.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/16 11:08
 * 地址：https://leetcode-cn.com/problems/subarray-sum-equals-k/
 */
public class _560_和为k的子数组 {
    public static void main(String[] args) {
        int[] s = new int[]{1,-1,-1};
        subarraySum(s,0);
    }
    public static int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) return 0;
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end >=0; end--) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
