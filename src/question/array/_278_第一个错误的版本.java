package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/15 20:51
 * 地址：https://leetcode-cn.com/problems/first-bad-version/
 */
public class _278_第一个错误的版本 {

    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low < high) {
            // 使用（low + high）/2 会造成溢出，所以使用下面的
            int mid = low + (high-low)/2;
            if (isBadVersion(mid)) {
                high = mid;
            }else {
                low = mid + 1;
            }
        }
        return high;
    }
    // 替代上面的函数，随便写的，防止出错
    public static boolean isBadVersion(int i) {
        return false;
    }
}
