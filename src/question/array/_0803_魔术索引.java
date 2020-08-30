package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/30 16:42
 * 地址：https://leetcode-cn.com/problems/magic-index-lcci/
 */
public class _0803_魔术索引 {
    // 暴力法
    public int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums[i]) return i;
        }
        return -1;
    }
}
