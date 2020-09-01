package question.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/1 10:33
 * 地址：https://leetcode-cn.com/problems/palindrome-permutation-lcci/
 */
public class _0104_回文排列 {
    // 字母的次数，最多只能有一个是奇数
    public boolean canPermutePalindrome(String s) {
        HashMap<Character,Integer> hash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (hash.containsKey(temp)) {
                hash.put(temp, hash.get(temp)+1);
            } else {
                hash.put(temp, 1);
            }
        }
        int count = 0;
        for (Map.Entry entry : hash.entrySet()) {
            int a = (int) entry.getValue();
            if (a % 2 == 1) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
