package 剑指offer.数组;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/12/20 11:15
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
