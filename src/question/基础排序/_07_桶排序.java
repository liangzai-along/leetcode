package question.基础排序;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/12/5 14:46
 */
public class _07_桶排序 {

    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) return 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        if (max == min) {
            return 0;
        }
        boolean[] hasNum = new boolean[len+1];
        int[] maxs = new int[len+1];
        int[] mins = new int[len+1];
        int bid = 0; //表示桶的位数
        for (int i = 0; i < len; i++) {
            // 确定当前数属于几号桶
            bid = bucket(nums[i], len, min, max);
            mins[bid] = hasNum[bid] ? Math.min(mins[bid], nums[i]) : nums[i];
            maxs[bid] = hasNum[bid] ? Math.max(maxs[bid], nums[i]) : nums[i];
            hasNum[bid] = true;
        }
        int res = 0;
        int lastMax = maxs[0];
        int i = 1;
        for (; i <= len; i++) {
            if (hasNum[i]) {
                res = Math.max(res, mins[i] - lastMax);
                lastMax = maxs[i];
            }
        }
        return res;
    }
    public int bucket(long num, long len, long min, long max) {
        return (int) ((num - min) * len / (max-min));
    }
}
