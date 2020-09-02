package question.链表;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/2 8:58
 * 地址：https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
 */
public class _0201_移除重复节点 {
    // 链表的题，指针比较多
/*    public ListNode removeDuplicateNodes(ListNode head) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode cur = head;
        while (cur != null) {
            int curVal = cur.val;
            // 两个指针，second指的是需要比较的数，first是需要比较的数的前面的数，为了移除操作
            ListNode first = cur;
            ListNode second = cur.next;
            cur = cur.next;
            while (second != null) {
                if (second.val == curVal) {
                    // 移除操作
                    first.next = first.next.next;
                } else {
                    first = first.next;
                }
                second = second.next;
            }
        }
        return res.next;
    }*/
}
