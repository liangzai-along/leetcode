package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/1 18:58
 * 地址：https://leetcode-cn.com/problems/reverse-string/
 */
public class _344_反转字符串 {
    // 左右两个指针进行交换
    public void reverseString(char[] s) {
        if (s == null || s.length == 0) return;
        int left = 0;
        int right = s.length-1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

}
