package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/16 10:57
 * 地址：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class _3_无重复字符的最长子串 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        int maxLength = 0;
        String preStr = "";
        for (int i = 0; i < s.length(); i++) {
            String current = String.valueOf(s.charAt(i));
            // 核心
            if (preStr.contains(current)) {
                // 滑动窗口=====当出现相同符号，则抛弃第一个出现的符号
                preStr = preStr.substring(preStr.lastIndexOf(current) + 1);
                preStr += current;

            }else {
                preStr += current;
            }
            if (preStr.length() > maxLength) {
                maxLength = preStr.length();
            }
        }
        return maxLength;
    }
}
