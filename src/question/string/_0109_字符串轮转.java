package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/1 10:51
 * 地址：https://leetcode-cn.com/problems/string-rotation-lcci/
 */
public class _0109_字符串轮转 {
    // 思路：拼接思想
    public boolean isFlipedString(String s1, String s2) {
        int s1Len = s1.length();
        int s2Len = s2.length();
        if (s1Len != s2Len) return false;
        return (s2 + s2).indexOf(s1) != -1;
    }
}
