package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/24 10:57
 * 地址：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 */
public class _03_数组中重复的数字 {
    public int findRepeatNumber(int[] nums) {
        // 这里有映射关系，利用数组实现hash
        int[] hash = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }
        int res = 0;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 1) {
                res = i;
                break;
            }
        }
        return res;
    }
}
