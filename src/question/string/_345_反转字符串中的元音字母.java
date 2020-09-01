package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/1 19:09
 * 地址：https://leetcode-cn.com/problems/reverse-vowels-of-a-string/
 */
public class _345_反转字符串中的元音字母 {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) return s;
        String yuanyin = "aeiouAEIOU";
        char[] c = s.toCharArray();
        int start = 0;
        int end = c.length-1;
        while (start < end) {
            // 主要是利用两个指针记录两个元音
            while (start < end && !yuanyin.contains(c[start]+"")) {
                start++;
            }
            while (start < end && !yuanyin.contains(c[end]+"")) {
                end--;
            }
            swap(c, start, end);
            start++;
            end--;
        }
        return new String(c);

    }
    // 交换
    public void swap(char[] s, int i ,int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
