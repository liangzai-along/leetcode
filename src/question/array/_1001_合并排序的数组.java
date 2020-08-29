package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/29 9:26
 * 地址：https://leetcode-cn.com/problems/sorted-merge-lcci/
 */
public class _1001_合并排序的数组 {
    public void merge(int[] A, int m, int[] B, int n) {
        int cur = m + n - 1;
        int i1 = m - 1;
        int i2 = n - 1;
        while (i2 >= 0) {
            if (i1 < 0) {
                A[cur--] = B[i2--];
                continue;
            }
            if (A[i1] > B[i2]) {
                A[cur--] = A[i1--];
            } else {
                A[cur--] = B[i2--];
            }
        }

    }
}
