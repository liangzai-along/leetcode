package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/14 10:04
 * 地址：https://leetcode-cn.com/problems/rotate-image/
 */
public class _48_旋转图像 {

    // 思路：难点是原地旋转矩阵，不使用额外空间
    // 思路：对称两下,先对角对称，然后再中间对称
    public void rotate(int[][] matrix) {

        // 斜对角对称
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (row < col) {
                    swap(matrix,row,col);
                }
            }
        }
        // 中间对称输出
        for (int row = 0; row < matrix.length; row++) {
            int left = 0;
            int right = matrix[0].length-1;
            while (left < right) {
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;
                left++;
                right--;
            }
        }
    }


    public void swap(int[][] matrix, int i , int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
