package question.排序;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/5 19:45
 * 地址：https://leetcode-cn.com/problems/valid-anagram/
 */
public class _242_有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        int slen = schar.length;
        int rlen = tchar.length;
        if (slen != rlen) return false;
        for (int i = 0; i < slen; i++) {
            boolean flag = false;
            for (int j = 0; j < rlen; j++) {
                if (schar[i] == tchar[j]) {
                    flag = true;
                    tchar[j] = '#';
                    break;
                }
            }
            if (flag == false) return false;
        }
        return true;
    }
}
