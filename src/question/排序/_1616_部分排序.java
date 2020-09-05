package question.排序;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/5 14:07
 * 地址：https://leetcode-cn.com/problems/sub-sort-lcci/
 */
public class _1616_部分排序 {
    // 思路：先遍历一遍找出最后一个无序的数，然后往前找出第一个无序的数
    // 一个数保存当前最大值,
    public int[] subSort(int[] array) {
        if (array == null || array.length < 2) return new int[]{-1,-1};
        int curMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int end = -1;
        int start = -1;
        for (int i = 1; i < array.length; i++) {
            int cur = array[i];
            if (cur >= curMax) {
                curMax = cur;
            } else {
                end = i;
            }
        }

        if (end != -1) {
            for (int i = end; i >= 0; i--) {
                if (array[i] <= min) {
                    min = array[i];
                } else {
                    start = i;
                }
            }
        }

        return new int[]{start, end};
    }
}
