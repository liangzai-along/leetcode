package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/30 10:27
 * 地址：https://leetcode-cn.com/problems/missing-number-lcci/
 */
public class _1704_消失的数字 {
    // 和有重复那道题有点像，要做一些处理，可以借助一个辅助数组
    public int missingNumber(int[] nums) {
        int[] res = new int[nums.length+1];
        int result = 0;
        // 辅助数组
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            res[temp] = temp;
        }
        for (int i = 1; i < res.length; i++) {
            if (res[i] == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}
