package question.链表;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/2 15:36
 * 地址：https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */
public class _876_链表的中间节点 {
//    思路：一次遍历获取节点个数，然后获取一半的个数，再遍历一次获取
/*    public ListNode middleNode(ListNode head) {

        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int k = count / 2;
        ListNode res = head;
        for (int i = 0; i < k; i++) {
            res = res.next;
        }
        return res;
    }*/
}
