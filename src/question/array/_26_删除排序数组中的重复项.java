package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/23 10:38
 * 地址：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class _26_删除排序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            // 和27题的区别是，比较对象的不同，27是固定的，26则是动态的，保存在数组中
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}
