package question.双指针;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/20 19:08
 * 地址：https://leetcode-cn.com/problems/linked-list-cycle/
 */
public class _141_环线链表 {
    // 快慢双指针，判断是否有环
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        // 两个指针
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            if (slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
