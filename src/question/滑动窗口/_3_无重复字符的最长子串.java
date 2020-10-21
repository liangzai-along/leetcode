package question.滑动窗口;

import java.util.HashMap;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/10/21 21:24
 * 地址：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class _3_无重复字符的最长子串 {
    // 利用额外空间hashmap记录
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        HashMap<Character,Integer> hash = new HashMap<>();
        int left = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            // 滑动窗口，利用hash当窗口，当出现相同符号时，抛弃第一个出现的符号：hash.get(s.charAt(i))+1
            if (hash.containsKey(s.charAt(i))) {
                // 主要是这确定最左边的位置
                left = Math.max(left, hash.get(s.charAt(i))+1);
            }
            hash.put(s.charAt(i), i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
