package 剑指offer.栈和队列;

import java.util.Stack;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/12/13 15:50
 */
public class _09_两个栈实现队列 {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public _09_两个栈实现队列() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // 在队列尾部插入元素;stack1完全做输入栈
    public void appendTail(int value) {
        stack1.push(value);
    }

    // 在删除队列头部元素；stack2做输出栈
    // 这里出现的问题是：stack1满了
    public int deleteHead() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.isEmpty() ? -1 : (int)stack2.pop();
    }
}
