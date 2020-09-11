package question.回朔;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/11 10:55
 * 地址：https://leetcode-cn.com/problems/palindrome-partitioning/
 */
public class _131_分割回文串 {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrack(s, 0, new ArrayList<String>());
        return res;
    }

    // 回溯，选择列表，选择路径，终止条件
    // 选择路径track, 选择列表s:要怎么选择
    // 思路，切分的方法，然后判断
    public void backtrack(String s, int start, ArrayList<String> track) {
        int len = s.length();
        if (start == len) {
            res.add(new ArrayList<>(track));
            return;
        }
        // 选择列表：切的次数
        for (int i = start; i < len; i++) {
            String s1 = s.substring(start, i+1);
            if (!isPalindrome(s1)) {
                continue;
            }
            track.add(s1);
            backtrack(s,i+1,track);
            track.remove(track.size()-1);
        }
    }

    // 判断回文
    public boolean isPalindrome(String s) {
        int len = s.length();
        if (len  == 1) return true;
        int left = 0;
        int right = len-1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
