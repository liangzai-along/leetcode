package question.排序;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/12/6 15:53
 */
public class _147_对链表进行插入排序 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode lastSort = head;
        ListNode curr = head.next;
        while (curr != null) {
            // 如果是有序的
            if (lastSort.val <= curr.val) {
                lastSort = lastSort.next;
            } else {
                // 如果是无序的
                ListNode pre = dummy;
                while (pre.next.val < curr.val) {
                    pre = pre.next;
                }
                lastSort.next = curr.next;
                curr.next = pre.next;
                pre.next = curr;
            }
            curr = lastSort.next;
        }
        return dummy.next;
    }
}
