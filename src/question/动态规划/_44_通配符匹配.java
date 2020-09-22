package question.动态规划;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/22 21:10
 * 地址：https://leetcode-cn.com/problems/wildcard-matching/comments/
 */
public class _44_通配符匹配 {


    public boolean isMatch(String s, String p) {
        int sp = 0; // s的指针
        int pp = 0; // p的指针
        // 主要是为了解决*的匹配
        int start = -1;
        int match = 0;

        while (sp < s.length()) {
            if (pp < p.length() && (s.charAt(sp) == p.charAt(pp) || p.charAt(pp) == '?')){
                sp++;
                pp++;
            } else if (pp < p.length() && p.charAt(pp) == '*') {
                start = pp; // 标记模板*的位置
                match = sp; // 标记字符串当前的位置
                pp++;
            } else if (start != -1) {
                // 就是锁住比较*后面这个单词
                pp = start+1;
                // 一直增加比较的数
                match++;
                sp=match;
            } else {
                return false;
            }
        }
        // 最后p剩下*
        while (pp < p.length() && p.charAt(pp) == '*') {
            pp++;
        }
        return pp == p.length();
    }
}
