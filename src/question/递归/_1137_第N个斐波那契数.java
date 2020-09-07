package question.递归;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/18 17:05
 * 地址：https://leetcode-cn.com/problems/n-th-tribonacci-number/
 */
public class _1137_第N个斐波那契数 {

    // 递归题，但是超出时间限制，改为动态规划
    public int tribonacci(int n) {
        if (n <= 1) return n;
        if (n == 2) return 1;
        int a = 0;
        int b = 1;
        int c = 1;
        int res = 0;
        for (int i = 3; i <= n; i++) {
            res = a + b + c;
            int temp1 = c;
            int temp2 = b;
            b = temp1;
            a = temp2;
            c = res;
        }
        return res;
    }
}
