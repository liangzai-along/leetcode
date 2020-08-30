package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/30 16:50
 * 地址：https://leetcode-cn.com/problems/check-permutation-lcci/
 */
public class _0102_判定是否互为字符重排 {
    // 思路1：暴力法，暴力匹配每个字符
    public boolean CheckPermutation(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int count = 0;
        if (c1.length != c2.length) return false;
        for (int i = 0; i < c1.length; i++) {
            char temp = c1[i];
            for (int j = 0; j < c2.length; j++) {
                if (temp == c2[j]) {
                    count++;
                    // 防止重复比较
                    c2[j] = '#';
                    break;
                }
            }
        }
        return count == c2.length;
    }
}
