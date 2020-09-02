package question.链表;

import java.util.Stack;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/2 8:37
 * 地址：https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
public class _06_从尾到头打印链表 {
//    倒过来的问题，利用栈的先进后出或者递归来实现
/*    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
            count++;
        }
        int[] res = new int[count];
        int i = 0;
        while (i < count) {
            res[i] = stack.pop();
            i++;
        }
        return res;
    }*/
}
