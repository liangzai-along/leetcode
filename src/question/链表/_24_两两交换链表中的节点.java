package question.链表;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/2 19:13
 * 地址：https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 */
public class _24_两两交换链表中的节点 {

    // 指针
/*    public ListNode swapPairs(ListNode head) {
        // 假头
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        // 双指针
        ListNode pre = fakeHead;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            // 存储当前三个节点
            ListNode first = cur;
            ListNode second = cur.next;
            ListNode third = cur.next.next;
            // 交换
            pre.next = second;
            second.next = first;
            first.next = third;
            // cur后移两位
            pre = first;
            cur = third;
        }
        return fakeHead.next;
    }*/
}
