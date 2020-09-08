package question.查找;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/8 15:01
 * 地址：https://leetcode-cn.com/problemset/all/?topicSlugs=binary-search&difficulty=%E7%AE%80%E5%8D%95
 */
public class _441_排列硬币 {
    // 二分法
    public int arrangeCoins(int n) {
        int left = 0;
        int right = n;
        while (left <= right) {
            int mid = left + (right-left)/2;
            long res = ((long)mid*mid+mid)/2;
            if (res == n) {
                return mid;
            } else if (res > n) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return left-1;
    }
}
