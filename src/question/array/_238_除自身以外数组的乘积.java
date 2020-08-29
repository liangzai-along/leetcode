package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/29 15:05
 * 地址：https://leetcode-cn.com/problems/product-of-array-except-self/
 */
public class _238_除自身以外数组的乘积 {
    // 思路1：暴力解法
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0; i < nums.length; i++) {
            int sum = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j == i) continue;
                sum *= nums[j];
            }
            res[i] = sum;
        }
        return res;
    }
}
