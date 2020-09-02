package question.链表;

import java.util.Stack;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/2 8:48
 */
public class _0202_返回倒数第k个节点 {
    // 思路：倒的问题可以利用栈，存储然后再搞倒k，时间复杂度比较高
/*    public int kthToLast(ListNode head, int k) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        int i = 0;
        int res = 0;
        while (i < k) {
            res = (int)stack.pop();
            i++;
        }
        return res;
    }*/
}
