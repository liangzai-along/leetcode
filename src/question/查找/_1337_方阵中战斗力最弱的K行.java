package question.查找;

import java.util.Arrays;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/7 20:27
 * 地址：https://leetcode-cn.com/problems/the-k-weakest-rows-in-a-matrix/
 */
public class _1337_方阵中战斗力最弱的K行 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] list = new int[mat.length];
        int[] result = new int[k];
        // 关键，计算和之后乘100+序号
        for(int i=0;i<mat.length;i++){
            list[i] = count(mat[i])*100+i;
        }
        Arrays.sort(list);
        // %100可以得到原来的序号，巧用数学
        for(int i=0;i<k;i++){
            result[i] = list[i]%100;
        }
        return result;
    }
    public int count(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            if (n != 1) break;
            sum += n;
        }
        return sum;
    }
}
