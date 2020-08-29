package question.stack;

import java.util.Stack;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/29 9:05
 * 地址：https://leetcode-cn.com/problems/valid-parentheses/
 */
public class _20_有效的括号 {

    /**
     * 思路：
     * 1：有效括号的方式有两种：（）（）;（{}）
     * 2：所以可以利用栈结构，遇左符号，压入相反的符号；遇到相反的符号，则将前面的弹出看是否相等，相等则是有效括号
     * 3：如果一开始就遇到右括号，则无效，最后栈中还剩元素，则无效
     * @param s
     * @return
     */
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i ++) {
            char tmp = s.charAt(i);
            if (tmp == '(') {
                stack.push(')');
            } else if (tmp == '{') {
                stack.push('}');
            } else if (tmp == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || tmp != stack.pop()) { // 这里判断需要记住一下子
                return false;
            }
        }
        return stack.isEmpty();

        // HashMap<Character, Character> map = new HashMap<>();
        // map.put('(', ')');
        // map.put('[', ']');
        // map.put('{', '}');

        // Stack<Character> stack = new Stack<>();
        // int len = s.length();
        // for (int i = 0; i < len; i++){
        //     char c = s.charAt(i);
        //     if (map.containsKey(c)){
        //         stack.push(c);
        //     }else{
        //         if (stack.isEmpty()) return false;

        //         char left = stack.pop();
        //         if (c != map.get(left)) return false;
        //     }
        // }
        // return stack.isEmpty();
    }
}
