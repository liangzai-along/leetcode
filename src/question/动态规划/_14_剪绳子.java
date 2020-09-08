package question.动态规划;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/8 15:31
 * 地址：https://leetcode-cn.com/problems/jian-sheng-zi-lcof/
 */
public class _14_剪绳子 {
    // 动态规划
    public int cuttingRope(int n) {
        if (n < 2) return 0;
        if (n == 2) return 1;
        if (n == 3) return 2;
        int[] res = new int[n+1];
        res[0] = 0;
        res[1] = 1;
        res[2] = 2;
        res[3] = 3;
        int max = 0;
        for (int i = 4; i <= n; i++) {
            max = 0;
            for (int j = 1; j <= i/2; j++) {
                int temp = res[j] * res[i-j];
                if (temp > max) {
                    max = temp;
                }
            }
            res[i] = max;
        }
        return res[n];
    }
}
