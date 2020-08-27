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
}
