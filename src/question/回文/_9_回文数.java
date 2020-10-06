package question.回文;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/10/6 14:01
 * 地址：https://leetcode-cn.com/problems/palindrome-number/
 */
public class _9_回文数 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        char[] array = String.valueOf(x).toCharArray();
        int len = array.length;
        if (len == 1) return true;
        int left = 0;
        int right = len-1;
        while (left <= right) {
            if (array[left] != array[right]) return false;
            left++;
            right--;
        }
        return true;
    }
}
