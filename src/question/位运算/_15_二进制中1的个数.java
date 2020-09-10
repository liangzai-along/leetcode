package question.位运算;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/10 20:47
 * 地址：https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 */
public class _15_二进制中1的个数 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res += n & 1;
            // 注意>> 和>>>的区别
            n >>>= 1;
        }
        return res;
    }
}
