package question.回文;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/10/6 9:25
 * 地址：https://leetcode-cn.com/problems/longest-palindromic-substring/
 */
public class _5_最长回文子串 {

    // 思路：1：判断回文一个函数； 2：最长需要一个变量来保存比较； 3：
    public String longestPalindrome(String s) {
        // 边界处理
        if (s.length() == 1) return s;
        if (s.length() == 0 || s == null) return "";
        int maxLen = 1; // 回文子串最大长度
        // 子串处理
        char[] array = s.toCharArray();
        int begin = 0;
        // 暴力双重遍历法
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (j-i+1 > maxLen && isPalindrome(array, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin+maxLen);
    }

    // 判断char数组是否回文
    public boolean isPalindrome (char[] array, int left, int right) {
        // left right为左右指针
        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
