package question.排序;

import java.util.Arrays;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/5 21:10
 * 地址：https://leetcode-cn.com/problems/largest-perimeter-triangle/
 */
public class _976_三角形的最大周长 {
    // 思路：排序，最大的往往在最后面
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);

        for (int i = A.length-1; i >= 2; i--) {
            int a = A[i];
            int b = A[i-1];
            int c = A[i-2];
            if (a < b+c) {
                return a+b+c;
            }
        }
        return 0;
    }
}
