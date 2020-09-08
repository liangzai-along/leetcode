package question.查找;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/8 12:50
 * 地址:https://leetcode-cn.com/problemset/all/?topicSlugs=binary-search&difficulty=%E7%AE%80%E5%8D%95
 */
public class _69_x的平方根 {
    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long)mid * mid == x) {
                return mid;
            } else if ((long)mid * mid < x) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        // 注意
        return l-1;
    }

}
