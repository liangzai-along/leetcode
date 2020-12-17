package 剑指offer.栈和队列;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/12/17 14:42
 */
public class _59_滑动窗口的最大值 {

    // 暴力法
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) return new int[0];
        int[] res = new int[nums.length-k+1];
        for (int i = 0; i <= nums.length-k; i++) {
            int temp = nums[i];
            for (int j = i; j < i+k; j++) {
                temp = Math.max(temp, nums[j]);
            }
            res[i] = temp;
        }
        return res;
    }
}
