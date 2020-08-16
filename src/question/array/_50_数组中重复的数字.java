package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/16 10:24
 * 地址：https://www.nowcoder.com/ta/coding-interviews
 */
public class _50_数组中重复的数字 {
    public int findDuplicate(int[] nums) {
        // 快慢指针
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
