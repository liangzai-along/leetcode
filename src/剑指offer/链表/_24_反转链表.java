package 剑指offer.链表;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/12/18 21:36
 */
public class _24_反转链表 {
    // 递归思想
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverse;
    }
}
