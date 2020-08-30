package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/30 21:05
 * 地址：https://leetcode-cn.com/problems/valid-palindrome/
 */
public class _125_验证回文串 {
    // 主要是数据清洗
    public boolean isPalindrome(String s) {
        // 只考虑字母和数字符号，可以忽略大小写
        // 思路，将上述s转换到一个数组中

        // 数据清洗
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            // 判断是数字和字母
            if (Character.isLetterOrDigit(temp)) {
                // 全部小写
                str.append(Character.toLowerCase(temp));
            }
        }
        // 判断回文
        String s1 = str.toString();
        int left = 0;
        int right = s1.length()-1;
        while (left <= right) {
            if (s1.charAt(left) != s1.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
