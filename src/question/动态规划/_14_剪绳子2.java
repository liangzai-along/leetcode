package question.动态规划;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/8 16:07
 * 地址：https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/
 */
public class _14_剪绳子2 {
    // 贪心
    // 因为取模后，不能比较，所以不能使用动态规划，改用贪心
    // 贪心是需要数学知识，也就是在策略上进行优化
    public int cuttingRope(int n) {
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;
        long res = 1;
        while(n > 4){
            res *= 3;
            res = res % 1000000007;
            n -= 3;
        }
        return (int)(res * n % 1000000007);
    }
}
