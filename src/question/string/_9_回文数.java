package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/21 13:23
 * 地址：https://leetcode-cn.com/problems/palindrome-number/
 */
public class _9_回文数 {

    public boolean isPalindrome(int x) {

        if (x < 0) return false;

        char[] nums = String.valueOf(x).toCharArray();
        int len = nums.length;
        if (len <= 1) return true;

        int left = 0;
        int right = len - 1;
        while(left < right) {
            if (nums[left] != nums[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
