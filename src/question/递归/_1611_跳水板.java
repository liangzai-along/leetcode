package question.递归;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/12 19:21
 * 地址：https://leetcode-cn.com/problems/diving-board-lcci/
 */
public class _1611_跳水板 {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int[] array = new int[k+1];
        // 主要是这里的数学问题分析
        for (int i = 0; i <= k; i++) {
            array[i] = shorter * k + (longer - shorter) * i;
        }
        return array;
    }
}
