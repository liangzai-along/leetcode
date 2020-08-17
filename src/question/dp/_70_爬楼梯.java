package question.dp;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/17 9:22
 * 地址：https://leetcode-cn.com/problems/climbing-stairs/
 */
public class _70_爬楼梯 {
    // 递归解法===超出时间限制
    public int climbStairs(int n) {
        if (n <= 0 ) return 0;
        if (n == 1 || n == 2) return n;
        return climbStairs(n-1) + climbStairs(n-2);
    }
    // dp解法
    public int climbStairs2(int n) {
        if (n <= 0 ) return 0;
        if (n == 1 || n == 2) return n;
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            second = first + second;
            first = second - first;
        }
        return second;
    }
}
