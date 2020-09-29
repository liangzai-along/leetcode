package question.哈希;

import java.util.HashMap;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/29 14:25
 * 地址：https://leetcode-cn.com/problems/bulls-and-cows/
 */
public class _299_猜数字游戏 {
    // 思路:这里有位置和字母的映射,数据结构采用hash
    public String getHint(String secret, String guess) {
        int Acount = 0;
        int Bcount = 0;
        char[] schar = secret.toCharArray();
        char[] gchar = guess.toCharArray();
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < schar.length; i++) {
            if (schar[i] == gchar[i]) {
                Acount++;
            } else {
                hash.put(schar[i], hash.getOrDefault(schar[i], 0)+1);
            }
        }
        for (int i = 0; i < gchar.length; i++) {
            char c = gchar[i];
            if (hash.containsKey(c) && hash.get(c) >= 1 && schar[i] != c) {
                Bcount++;
                hash.put(c, hash.get(c)-1);
            }
        }
        return (Acount+"A"+Bcount+"B");
    }
}
