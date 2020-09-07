package question.查找;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/7 22:08
 * 地址：https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target/
 */
public class _744_寻找比目标字母大的最小字母 {
    // 排好序的，二分法
    // 难点，
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length-1;
        int len = letters.length;
        while (left <= right) {
            int mid = left + (right-left)/2;
            if (letters[mid] > target) {
                right = mid-1;
            } else if (letters[mid] <= target) {
                left = mid+1;
            }
        }
        // 如果目标字母比所有字母都大，则left=size，指向数组的第一个字母
        return letters[left % len];
    }
}
