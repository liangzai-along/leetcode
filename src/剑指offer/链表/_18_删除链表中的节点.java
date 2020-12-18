package 剑指offer.链表;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/12/18 21:25
 */
public class _18_删除链表中的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode headFake = new ListNode(0);
        headFake.next = head;
        ListNode cur = headFake;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }
        return headFake.next;
    }
}
