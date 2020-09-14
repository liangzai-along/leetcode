package question.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/14 9:37
 * 地址：https://leetcode-cn.com/problems/group-anagrams/
 */
public class _49_字母异位词分组 {
    // 思路：暴力解法
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return null;
        boolean[] isUsed = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            List<String> temp = new ArrayList<>();
            if (!isUsed[i]) {
                temp.add(strs[i]);
                isUsed[i] = true;
                for (int j = i+1; j < strs.length; j++) {
                    if (isEctopic(strs[i], strs[j]) && !isUsed[j]) {
                        temp.add(strs[j]);
                        isUsed[j] = true;
                    }
                }
            }
            if (temp.size() != 0) {
                res.add(new ArrayList<>(temp));
            }
        }
        return res;
    }


    // 判断是否异位
    public boolean isEctopic (String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.length() == 0 && s2.length() == 0) return true;
        if (s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0) return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            boolean flag = false;
            for (int j = 0; j < c2.length; j++) {
                if (c1[i] == c2[j]) {
                    c2[j]='#';
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }
}
