package 剑指offer.链表;

import java.util.Stack;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/12/18 21:20
 */
public class _06_从尾到头打印链表 {

    // 链表的题，主要是在空间复杂度上优化
    // 利用额外数据结构进行求解
    //  反转的东西，优先考虑栈和队列
    public int[] reversePrint(ListNode head) {

        Stack<Integer> stackData = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            stackData.push(cur.val);
            cur = cur.next;
        }
        int[] res = new int[stackData.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stackData.pop();
        }
        return res;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
