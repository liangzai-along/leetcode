package question.stack;

import java.util.Stack;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/6 11:08
 * 地址：https://leetcode-cn.com/problems/baseball-game/
 */
public class _682_棒球比赛 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            String temp = ops[i];
            if (temp.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (temp.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (temp.equals("C")) {
                stack.pop();
            } else{
                // 遇到数字，push
                stack.push(Integer.valueOf(temp));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}
