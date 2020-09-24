package question.动态规划;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/24 9:55
 * 地址：https://leetcode-cn.com/problems/max-submatrix-lcci/comments/
 */
public class _1724_最大子矩阵 {
    // 主要思路，把维度降下来，也就是多了几个for，降维打击
    public int[] getMaxMatrix(int[][] matrix) {
        // 行列
        int n = matrix.length;
        int m = matrix[0].length;
        int[] target = new int[] {-1,-1,-1,-1};
        int[] sum = new int[m];
        int maxofGlobal = Integer.MIN_VALUE;
        // 一层
        for (int top = 0; top < n; top++) {
            // 每次都初始化
            for (int i = 0; i < m; i++) {
                sum[i] = 0;
            }
            // (0-n),(1-n),(2-n)等这样的层数的和,sum代表一列
            for (int bottom = top; bottom < n; bottom++) {
                for (int i = 0; i < m; i++) {
                    sum[i] += matrix[bottom][i];
                }
                // 计算当前最大值，这里就和一维的是一样了
                int cur = 0, left = 0, right = -1;
                int max = Integer.MIN_VALUE;
                int s1 = 0;
                for (int i = 0; i < m; i++) {
                    cur += sum[i];
                    if (cur > max) {
                        left = s1;
                        right = i;
                        max = cur;
                    }
                    if (cur < 0) {
                        cur = 0;
                        s1 = i+1;
                    }
                }
                if (max > maxofGlobal) {
                    target[0] = top;
                    target[1] = left;
                    target[2] = bottom;
                    target[3] = right;
                    maxofGlobal = max;
                }
            }
        }
        return target;
    }
}
