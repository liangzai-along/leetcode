package question.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/30 15:37
 * 地址：https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/
 */
public class _29_顺时针打印矩阵 {
    // 时间复杂度太高了
    public int[] spiralOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0 ) return new int[0];

        List<Integer> res = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int[] result = new int[(bottom+1)*(right+1)];
        while (true) {
            // 从左到右
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            // 这些关键，对下一步以及环绕一拳后操作
            if (++top >  bottom) break;
            // 从上到下
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            if (--right < left) break;
            //  从右到左
            for (int i = right; i >= left; i--) {
                res.add(matrix[bottom][i]);
            }
            if (--bottom < top) break;
            // 从下到上
            for (int i = bottom; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            if (++left > right) break;
        }


        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
