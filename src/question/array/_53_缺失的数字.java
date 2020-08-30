package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/30 15:02
 * 地址：https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 */
public class _53_缺失的数字 {
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
