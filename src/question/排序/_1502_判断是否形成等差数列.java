package question.排序;

import java.util.Arrays;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/5 10:06
 * 地址：https://leetcode-cn.com/problems/can-make-arithmetic-progression-from-sequence/
 */
public class _1502_判断是否形成等差数列 {
    // 思路:重新排序之后，然后再做判断
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if ((arr[i]-arr[i-1]) != diff) return false;
        }
        return true;
    }
}
