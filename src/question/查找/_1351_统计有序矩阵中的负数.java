package question.查找;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/7 19:59
 * 地址：https://leetcode-cn.com/problemset/all/?difficulty=%E7%AE%80%E5%8D%95&topicSlugs=binary-search
 */
public class _1351_统计有序矩阵中的负数 {
    // 思路：注意是有序矩阵，查找先有考虑二分查找
    // 因为行和列都是有序的，使用对角线顶点元素进行比较
    public int countNegatives(int[][] grid) {
        int row = 0;
        int rowCount = grid.length;
        int col = grid[0].length-1;
        int count = 0;
        while (col >= 0 && row <= grid.length-1) {
            if (grid[row][col] < 0) {
                count = count + (rowCount-row);
                col--;
            } else if (grid[row][col] >= 0) {
                row++;
            }
        }
        return count;
    }
}
