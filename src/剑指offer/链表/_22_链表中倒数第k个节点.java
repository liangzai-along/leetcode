package 剑指offer.链表;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/12/18 21:32
 */
public class _22_链表中倒数第k个节点 {
    // 快慢指针，这种倒数的问题
    public ListNode getKthFromEnd(ListNode head, int k) {
        // 边界问题
        if (head == null || k <= 0) return null;
        ListNode headFake = new ListNode(0);
        headFake.next = head;

        ListNode slow = headFake;
        ListNode fast = headFake;

        for (int i = 0; i < k; i++) {
            // k如果大于总节点数：属于边界判断
            if (fast != null) {
                fast = fast.next;
            } else {
                return null;
            }
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}
