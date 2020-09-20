package question.双指针;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/20 19:02
 * 地址：https://leetcode-cn.com/problems/middle-of-the-linked-list/comments/
 */
public class _876_链表的中间节点 {
    // 快慢双指针
    public ListNode middleNode(ListNode head) {
        // 空判断
        if (head == null) return null;

        // 快慢双指针:一个走两个，一个走一个，最后快的到达终点，慢的刚好在中间
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
