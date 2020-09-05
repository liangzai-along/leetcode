package question.排序;

import java.util.HashSet;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/5 14:44
 * 地址：https://leetcode-cn.com/problems/sum-swap-lcci/
 */
public class _1621_交换和 {
    // 思路：先计算和的差值,然后两数组是否有两个数相加的两倍为差值
    // 数学问题
    // 两层遍历超出时间限制，后面改用hashset来降低时间复杂度
    public int[] findSwapValues(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
            set.add(array2[i]);
        }
        int diff = sum1 - sum2;
        if (diff % 2 != 0) {
            return new int[0];
        }

        for (int i = 0; i < array1.length; i++) {
            int temp = Math.abs(diff/2 - array1[i]);
            if (set.contains(temp)) {
                return new int[]{array1[i], temp};
            }
        }
        return new int[0];
    }
}
