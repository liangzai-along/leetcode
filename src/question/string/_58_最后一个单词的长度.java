package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/30 21:23
 * 地址：https://leetcode-cn.com/problems/length-of-last-word/
 */
public class _58_最后一个单词的长度 {
    public int lengthOfLastWord(String s) {
        String[] c = s.split(" ");
        int len = c.length-1;
        if (s == null || len == -1) {
            return 0;
        }
        if (c[len].equals("")) return 0;
        return c[len].length();
    }
}
