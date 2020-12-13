package 剑指offer.栈和队列;

import java.util.Stack;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/12/13 16:37
 */
public class _30_包含min函数的栈 {
    /** initialize your data structure here. */
    // 两个栈：一个用来保存数据，一个用来保存最小数
    Stack<Integer> stack;
    Stack<Integer> minS;

    /** initialize your data structure here. */
    public _30_包含min函数的栈() {
        minS=new Stack<Integer>();
        stack=new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        if(minS.isEmpty()||minS.peek()>=x){
            minS.push(x);
        }
    }

    public void pop() {
        // int x = stack.pop();
        // if(x == minS.peek()){
        //      minS.pop();
        //  }

        //注意这里不能用==，====比较的是Integer对象
        if(stack.peek().equals(minS.peek())){
            minS.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minS.peek();
    }

}
