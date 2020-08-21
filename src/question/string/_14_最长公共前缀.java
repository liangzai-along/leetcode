package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/21 21:35
 * 地址：https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class _14_最长公共前缀 {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        int count = strs.length;
        int length = strs[0].length();
        for (int i = 0; i < length; i++) {
            // 第一个的字符
            char c = strs[0].charAt(i);
            // 和其他比较
            for (int j = 1; j < count; j++) {
                // 不想等和缺数字 两种情况
                if (i == strs[j].length() || strs[j].charAt(i) != c ) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
