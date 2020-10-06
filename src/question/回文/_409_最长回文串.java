package question.回文;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/10/6 10:21
 * 地址：https://leetcode-cn.com/problems/longest-palindrome/
 */
public class _409_最长回文串 {

    // 思路： hash
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hash.containsKey(s.charAt(i))) {
                hash.put(s.charAt(i), hash.get(s.charAt(i)) + 1);
            } else {
                hash.put(s.charAt(i), 1);
            }
        }
        int count = 0;
        boolean flag = false;
        for (Map.Entry entry: hash.entrySet()) {
            int temp = (int)entry.getValue();
            if (temp % 2 != 0) {
                flag = true;
            }
            if (temp % 2 == 0) {
                count += temp;
            }
            if (temp > 1 && temp % 2 != 0) {
                count += (temp-1);
            }
        }
        return flag ? count + 1 : count;
    }
}
