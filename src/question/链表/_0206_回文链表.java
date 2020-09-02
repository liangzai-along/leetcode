package question.链表;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/2 9:25
 * 地址：https://leetcode-cn.com/problems/palindrome-linked-list-lcci/
 */
public class _0206_回文链表 {
    // 借助外部数据结构将数据全部弄出来,剩下的回文判断和以前的一样了,为什么arraylist不行
 /*   public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        int[] ans = new int[count];
        ListNode temp2 = head;
        int i = 0;
        while (temp2 != null) {
            ans[i++] = temp2.val;
            temp2 = temp2.next;
        }

        // 回文判断
        int left = 0;
        int right = ans.length-1;
        while (left < right) {
            if (ans[left] != ans[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }*/
}
