package question.动态规划;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/29 10:09
 * 地址：https://leetcode-cn.com/problems/nge-tou-zi-de-dian-shu-lcof/
 */
public class _60_n个骰子的点数 {
    // 思路：动态规划
    public double[] twoSum(int n) {
        double[] pre = {1/6d, 1/6d, 1/6d, 1/6d, 1/6d, 1/6d};
        for (int i = 2; i <= n; i++) {
            double[] temp = new double[i*6-i+1];
            // 两个数组分别相加，第一个是上一得到的结果数组
            for (int x = 0; x < pre.length; x++) {
                for (int y = 0; y < 6; y++) {
                    temp[x+y] += pre[x]/6;
                }
            }
            pre = temp;
        }
        return pre;
    }
}
