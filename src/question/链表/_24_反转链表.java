package question.链表;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/2 10:14
 * 地址：https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 */
public class _24_反转链表 {
    // 反转链表，区别与反转值
    // 思路：递归
/*    public ListNode reverseList(ListNode head) {
        // 终止条件
        if (head == null || head.next == null) return head;
        // 倒数第二节点已经反转好了
        ListNode reverse = reverseList(head.next);
        // 然后倒数第一个节点
        head.next.next = head;
        head.next = null;

        return reverse;
    }*/
}
