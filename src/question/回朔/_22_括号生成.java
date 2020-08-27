package question.回朔;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/25 11:07
 * 地址：https://leetcode-cn.com/problemset/all/?topicSlugs=backtracking&listId=2cktkvj
 */
public class _22_括号生成 {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateALL(new char[2 * n], 0, res);
        return res;
    }

    public void generateALL(char[] current, int pos, List<String> res) {
        if (pos == current.length) {
            if (valid(current)) {
                res.add(new String(current));
            }
        } else {
            current[pos] = '(';
            generateALL(current, pos+1, res);
            current[pos] = ')';
            generateALL(current, pos+1, res);
        }
    }

    public boolean valid(char[] current) {
        int balance = 0;
        for (char c : current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return balance == 0;
    }

    public List<String> generateParenthesis2(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder track = new StringBuilder();
        backtrack(res, track, 0 ,0, n);
        return res;
    }

    // 回朔法进行改进，不是每次都添加
    public void backtrack(List<String> res, StringBuilder track, int open, int close, int max) {
        if (track.length() == max * 2) {
            res.add(track.toString());
            return;
        }
        if (open < max) {
            track.append('(');
            backtrack(res, track, open+1, close, max);
            track.deleteCharAt(track.length() - 1);
        }
        if (close < open) {
            track.append(')');
            backtrack(res, track, open, close+1, max);
            track.deleteCharAt(track.length() - 1);
        }
    }

    // 深度优先遍历，用减法，上下用的是加法
    // 参考：https://leetcode-cn.com/problems/generate-parentheses/solution/ru-men-ji-bie-de-hui-su-fa-xue-hui-tao-lu-miao-don/
    public void dfs(StringBuilder track, List<String> res, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(track.toString());
            return;
        }

        // 剪枝
        if (left > right) return;

        if (left > 0) {
            track.append('(');
            dfs(track, res, left-1, right);
            track.deleteCharAt(track.length() - 1);
        }
        if (right > 0) {
            track.append(')');
            dfs(track, res, left, right-1);
            track.deleteCharAt(track.length() - 1);
        }
    }
}
