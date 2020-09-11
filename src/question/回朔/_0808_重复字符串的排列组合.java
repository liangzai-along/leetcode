package question.回朔;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/11 20:01
 * 地址：https://leetcode-cn.com/problems/permutation-ii-lcci/
 */
public class _0808_重复字符串的排列组合 {

    // 全排列问题
    List<String> list = new ArrayList<>();
    public String[] permutation(String S) {
        char[] c = S.toCharArray();
        Arrays.sort(c);
        boolean[] isUsed = new boolean[c.length];
        StringBuilder track = new StringBuilder();
        backtrack(c, track, isUsed);
        String[] res = new String[list.size()];
        for (int i = 0; i < list.size();  i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void backtrack(char[] c, StringBuilder track, boolean[] isUsed) {
        if (track.length() == c.length) {
            list.add(track.toString());
            return;
        }

        for (int i = 0; i < c.length; i++) {
            if (isUsed[i]) {
                continue;
            }
            if (i > 0 && c[i] == c[i-1] && !isUsed[i-1]) {
                continue;
            }
            track.append(c[i]);
            isUsed[i] = true;

            backtrack(c, track, isUsed);

            isUsed[i] = false;
            track.deleteCharAt(track.length()-1);
        }
    }
}
