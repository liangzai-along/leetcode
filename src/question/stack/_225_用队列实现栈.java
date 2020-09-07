package question.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/7 9:29
 * 地址:https://leetcode-cn.com/problems/implement-stack-using-queues/
 */
public class _225_用队列实现栈 {

    Queue<Integer> inQueue = new LinkedList<>();
    Queue<Integer> outQueue = new LinkedList<>();
    /** Initialize your data structure here. */
    public _225_用队列实现栈() {

    }

    /** Push element x onto stack. */
    // 思路：in,每次进来push元素，
    // 然后将out中的压入其中，这样就保证每次进来的这个是最先pop出去的，（其实是最后push进来的），这样就实现了栈
    //核心是in的每次要空
    // 借助一个队列，让out队列的顺序反过来了
    public void push(int x) {
        inQueue.offer(x);
        //out的元素全部到a中
        while (!outQueue.isEmpty()) {
            inQueue.offer(outQueue.poll());
        }
        // 交换,使得in在没用push之前为空
        Queue temp = inQueue;
        inQueue = outQueue;
        outQueue = temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return outQueue.poll();
    }

    /** Get the top element. */
    public int top() {
        return outQueue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return outQueue.isEmpty();
    }
}
