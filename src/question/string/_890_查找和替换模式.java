package question.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/15 14:44
 * 地址：https://leetcode-cn.com/problems/find-and-replace-pattern/
 */
public class _890_查找和替换模式 {

    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> list = new ArrayList<>();
        // 边界判断
        if (words == null || words.length == 0) {
            return list;
        }
        // 数据结构选择，list

        // 算法设计，根据题目===模式匹配的规则=====
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            if (match(s, pattern) && match(pattern, s)) {
                list.add(s);
            }
        }
        return list;
    }

    // 同构字符串
    public boolean match(String s, String t) {
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
                map.put(cs[i],ct[i]);
            }
        }
        return true;
    }


}
