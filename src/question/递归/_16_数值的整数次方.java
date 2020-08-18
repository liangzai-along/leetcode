package question.递归;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/18 16:40
 * 地址：https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/
 */
public class _16_数值的整数次方 {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            return  1/x *myPow(1/x, -n-1);
        }
        if (n % 2 == 0) {
            // 这里n/2 子问题边得很好，不容易stack溢出
            return myPow( x * x, n/2);
        }else {
            return myPow(x * x, n/2) * x;
        }
    }
}
