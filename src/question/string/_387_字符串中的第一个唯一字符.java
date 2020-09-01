package question.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/1 19:39
 * 地址：https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 */
public class _387_字符串中的第一个唯一字符 {
    // 思路：hash, 但是时间复杂度要高一点
    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) return -1;
        HashMap<Character,Integer> hash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (hash.containsKey(temp)) {
                hash.put(temp, hash.get(temp)+1);
            } else {
                hash.put(temp, 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (hash.get(temp) == 1) {
                return i;
            }
        }
        return -1;
    }
}
