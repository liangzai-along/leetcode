package question.查找;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/8 14:44
 * 地址：https://leetcode-cn.com/problems/is-subsequence/
 */
public class _392_判断子序列 {
    // 思路:双指针，暴力解法
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        int i = 0; int j = 0;
        while (i < sLen && j < tLen) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == sLen;
    }
}
