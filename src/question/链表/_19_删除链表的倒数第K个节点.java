package question.链表;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/21 16:44
 * 地址：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class _19_删除链表的倒数第K个节点 {

/*    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 加一个假头，这样操作就全都一样了
        ListNode temp = new ListNode(0);
        temp.next = head;

        // 快慢指针
        ListNode tempSlow = temp;
        ListNode tempFast = temp;

        for(int i = 0; i <= n; i++) {
            tempFast = tempFast.next;
        }

        while (tempFast != null) {
            tempFast = tempFast.next;
            tempSlow = tempSlow.next;
        }

        tempSlow.next = tempSlow.next.next;

        return temp.next;
    }*/
}
