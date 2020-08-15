package question.string;

import java.util.HashMap;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/15 13:57
 * 地址：https://leetcode-cn.com/problems/isomorphic-strings/
 */
public class _205_同构字符串 {
    public static void main(String[] args) {
        String s = "aa";
        String t = "ab";
        isIsomorphicHelper(s, t);
        boolean isomorphic = isIsomorphic(s, t);
        System.out.println(isomorphic);

    }

    public static boolean isIsomorphic(String s, String t) {
        return isIsomorphicHelper(s, t) && isIsomorphicHelper(t, s);
    }


    // 题目意思就是，第一次e-a,之后 e不能再映射其他数字了
    // 数据结构选用：映射，一一对应关系，可以选用hash
    public static boolean isIsomorphicHelper(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) return false;
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < cs.length; i++) {
            if (map.containsKey(cs[i])) {
                if (map.get(cs[i]) != ct[i]) {
                    return false;
                }
            }else {
                map.put(cs[i], ct[i]);
            }
        }
        return true;
    }
}
