package question.链表;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/10/10 9:14
 * 地址：https://leetcode-cn.com/problems/linked-list-cycle-ii/comments/
 */
public class _142_环线链表2 {
    // 思路：快慢指针,注意是开始入环的第一个节点==转换到相交链表
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
