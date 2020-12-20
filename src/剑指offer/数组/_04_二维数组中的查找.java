package 剑指offer.数组;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/12/20 10:46
 */
public class _04_二维数组中的查找 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        // 边界判断
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        // 核心
        int row = 0;
        int col = matrix[0].length-1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }else if (matrix[row][col] > target) {
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
