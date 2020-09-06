package question.stack;

import java.util.Stack;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/6 9:52
 * 地址：https://leetcode-cn.com/problems/remove-outermost-parentheses/
 */
public class _1021_删除最外层的括号 {

    // 思路：
    public String removeOuterParentheses(String S) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int start = 0; // 原语开始
        int end = 0; // 原语结束
        // 关键，用于记录每个原语
        boolean flag = false;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '(') {
                stack.push(ch);

                if (!flag) {
                    start = i;
                    flag = true;
                }
            }
            if (ch == ')') {
                stack.pop();
                if (stack.isEmpty()) {
                    end = i;
                    // 删除原语的最外层
                    ans.append(S.substring(start+1, end));
                    flag = false;
                    start = end;
                }
            }
        }
        return ans.toString();
    }
}
