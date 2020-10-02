package question.哈希;

import java.util.HashSet;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/10/2 13:49
 * 地址：https://leetcode-cn.com/problems/jewels-and-stones/submissions/
 */
public class _711_宝石与石头 {
    // 思路：暴力遍历
    // public int numJewelsInStones(String J, String S) {
    //     if (J == null || S == null || J.length() == 0 || S.length() == 0) return 0;
    //     char[] jchar = J.toCharArray();
    //     char[] schar = S.toCharArray();
    //     int res = 0;
    //     for (int i = 0; i < schar.length; i++) {
    //         char temp = schar[i];
    //         for (int j = 0; j < jchar.length; j++) {
    //             if (temp == jchar[j]) {
    //                 res++;
    //             }
    //         }
    //     }
    //     return res;
    // }

    // 思路：hash存储，降低时间复杂度
    public int numJewelsInStones(String J, String S) {
        if (J == null || S == null || J.length() == 0 || S.length() == 0) return 0;
        char[] jchar = J.toCharArray();
        char[] schar = S.toCharArray();
        int res = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < jchar.length; i++) {
            set.add(jchar[i]);
        }
        for (int i = 0; i < schar.length; i++) {
            if (set.contains(schar[i])) {
                res++;
            }
        }
        return res;
    }
}
