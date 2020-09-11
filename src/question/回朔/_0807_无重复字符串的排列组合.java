package question.回朔;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/11 14:03
 * 地址：https://leetcode-cn.com/problems/permutation-i-lcci/
 */
public class _0807_无重复字符串的排列组合 {
    List<String> res = new ArrayList<>();
    int count = 0;
    public String[] permutation(String S) {
        backtrack(S, new ArrayList<>());
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = res.get(i);
        }
        return result;
    }

    public void backtrack(String S, ArrayList<Character> track) {
        if (track.size() == S.length()) {
            StringBuilder temp = new StringBuilder();
            for (Character character : track) {
                temp.append(character);
            }
            res.add(temp.toString());
            count++;
            return;
        }
        // 只想遍历树每一层要做的事
        for (int i = 0; i < S.length(); i++) {
            if (track.contains(S.charAt(i))) {
                continue;
            }
            track.add(S.charAt(i));
            // 下一层
            backtrack(S, track);
            // 第一层换其他字母
            track.remove(track.size()-1);
        }
    }
}
