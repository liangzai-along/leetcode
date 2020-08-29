package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/29 9:37
 * 地址：https://leetcode-cn.com/problems/transpose-matrix/
 */
public class _867_转置矩阵 {
    public int[][] transpose(int[][] A) {
        int rowLength = A.length;
        int colLength = A[0].length;
        int[][] res = new int[colLength][rowLength];
        // 这里需要注意，行列遍历顺序需要变换一下，然后下面访问顺序变换一下就好了
        //暴力法
        for (int col = 0; col < A[0].length; col++) {
            for (int row = 0; row < A.length; row++) {
                res[col][row] = A[row][col];
            }
        }
        return res;
    }
}
