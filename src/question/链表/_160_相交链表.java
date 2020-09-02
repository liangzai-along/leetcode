package question.链表;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/2 8:16
 * 地址：https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 */
public class _160_相交链表 {
    // 思路：走过路径A+B, B+A
/*    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }*/
}
