package question.排序;

import java.util.Arrays;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/5 10:28
 * 地址：https://leetcode-cn.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 */
public class _1491_去掉最低工资和最高工资之后的平均值 {
    // 思路：去重之后计算
    public double average(int[] salary) {
        Arrays.sort(salary);
        int sum = 0;
        for (int i = 1; i < salary.length-1; i++) {
            sum += salary[i];
        }
        double res = 0.0;
        res = (double)sum / (salary.length-2);
        return res;
    }
}
