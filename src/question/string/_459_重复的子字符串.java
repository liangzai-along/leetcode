package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/24 15:35
 * 地址：https://leetcode-cn.com/problems/repeated-substring-pattern/
 */
public class _459_重复的子字符串 {
    public boolean repeatedSubstringPattern(String s) {
        // 字符串拼在一起，去掉首尾一个字符，如果包含s,则是
        return (s+s).substring(1, 2 * s.length() - 1).contains(s);
    }
}
