package question.位运算;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/11/29 14:51
 */
public class _56_数组中数字出现的次数 {
    public int[] singleNumbers(int[] nums) {
        int sum = 0, zeroCount = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num == 0) zeroCount++;
            max = Math.max(max,num);
            min = Math.min(min,num);
            sum ^= num;
        }
        if (zeroCount == 1) return new int[]{sum, 0};
        int lo = min, hi = max;
        while (lo <= hi) {
            int mid = (lo < 0 && hi > 0) ? (lo+hi)>>1 : lo + (hi-lo)/2;
            int loSum = 0, hiSum = 0;
            for (int num : nums) {
                if (num <= mid) {
                    loSum ^= num;
                } else {
                    hiSum ^= num;
                }
            }
            if (loSum != 0 && hiSum != 0) return new int[]{loSum, hiSum};
            if (loSum == 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return null;
    }
}
