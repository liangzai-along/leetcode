package question.查找;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/8 14:29
 * 地址：https://leetcode-cn.com/problemset/all/?topicSlugs=binary-search&difficulty=%E7%AE%80%E5%8D%95
 */
public class _367_有效的完全平方数 {
    public boolean isPerfectSquare(int num) {
        if (sqrt(num) != -1) {
            return true;
        } else {
            return false;
        }
    }

    public int sqrt(int num) {
        int left = 0;
        int right = num;
        while (left <= right) {
            int mid = left + (right-left)/2;
            if (((long)mid*mid) == num) {
                return mid;
            } else if (((long)mid*mid) > num) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return -1;
    }
}
