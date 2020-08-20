package question.dp;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/20 16:30
 * 地址：https://leetcode-cn.com/problems/longest-palindromic-substring/
 */
public class _5_最长回文子串 {

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        char[] chars = s.toCharArray();
        int maxlen = 1;
        int begin = 0;
        for (int start = 0; start < len -1; start++) {
            for (int end = start + 1; end < len; end++) {
                if (end - start + 1 > maxlen && isValid(chars, start, end)) {
                    maxlen = end - start + 1;
                    begin = start;
                }
            }
        }
        return s.substring(begin, begin+maxlen);

    }

    // 判断是否回文
    public boolean isValid(char[] charArray, int left, int right) {
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
