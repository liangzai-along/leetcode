package question.查找;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/8 14:25
 * 地址：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/submissions/
 */
public class _167_两数之和 {
    // 思路:有序之和，二分法
    // 还是双指针
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int[] res = new int[2];
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                res[0] = left+1;
                res[1] = right+1;
                break;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return res;
    }
}
