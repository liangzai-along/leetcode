package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/25 10:48
 * 地址：https://leetcode-cn.com/problems/search-insert-position/
 */
public class _35_搜索插入位置 {
    // 注意一些边界，用一个数记录一下
    public int searchInsert(int[] nums, int target) {
        int begin = 0;
        int end = nums.length-1;
        int ans = end + 1;
        while (begin <= end) {
            int mid = begin + (end - begin) / 2;
            if (nums[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }
        return ans;
    }
}
