package question.排序;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/5 20:58
 * 地址：https://leetcode-cn.com/problems/sort-array-by-parity-ii/
 */
public class _922_奇偶排序数组2 {
    // 思路：找到偶数位上，是奇数的；找到技术位上，不是奇数的，两者进行交换
    public int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length - 1; i = i + 2) {
            // 不是偶数，找到偶数位上，是奇数的
            if ((A[i] & 1) != 0) {
                // 不是偶数，找到奇数位上，不是奇数的
                while ((A[j] & 1) != 0) {
                    j = j + 2;
                }
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        return A;
    }
}
