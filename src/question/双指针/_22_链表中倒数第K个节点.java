package question.双指针;


import datastructure.list.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/20 18:49
 * 地址：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */
public class _22_链表中倒数第K个节点 {
    // 快慢指针====两个指针
    public ListNode getKthFromEnd(ListNode head, int k) {
        // 边界判断
        if (head == null || k <= 0) return null;
        ListNode temp = new ListNode(-1);
        temp.next = head;
        // 快慢指针
        ListNode fast = temp;
        ListNode slow = temp;

        for (int i = 0; i < k; i++) {
            //如果K大于链表节点总数
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

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
