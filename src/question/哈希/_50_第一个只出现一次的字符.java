package question.哈希;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/11/28 14:25
 */
public class _50_第一个只出现一次的字符 {
    // hash,存储字符和次数
    //public char firstUniqChar(String s) {
    //    if (s == null || s.length() < 1) return ' ';
    //    HashMap<Character,Integer> hash = new HashMap<>();
    //    for (int i = 0; i < s.length(); i++) {
    //        if (hash.containsKey(s.charAt(i))) {
    //            hash.put(s.charAt(i), hash.get(s.charAt(i))+1);
    //        } else {
    //            hash.put(s.charAt(i), 1);
    //        }
    //
    //    }
    //    for (int i = 0; i < s.length(); i++) {
    //        for (Map.Entry entry : hash.entrySet()) {
    //            if (entry.getValue().equals(1) && entry.getKey().equals(s.charAt(i))) {
    //                return s.charAt(i);
    //            }
    //        }
    //    }
    //    return ' ';
    //}

    // 改进hash的无序，利用数组实现hash的功能
    public char firstUniqChar(String s) {
        if (s == null || s.length() < 1) return ' ';
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (hash[s.charAt(i)-'a']==1) return s.charAt(i);
        }
        return ' ';
    }
}
