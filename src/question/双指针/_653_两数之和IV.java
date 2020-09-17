package question.双指针;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/17 20:13
 * 地址：https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/submissions/
 */
public class _653_两数之和IV {

/*    // 思路：中序遍历之后，就是一个有序数组，然后有序数组双指针就可以找出来，如果不是有序数组，则hash会比较快
    List<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        travle(root);
        // 双指针
        int left = 0, right = list.size()-1;
        while (left < right) {
            int tempSum = list.get(left) + list.get(right);
            if (tempSum == k) {
                return true;
            } else if (tempSum > k) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    // 中序遍历
    public void travle(TreeNode root) {
        if (root == null) return;
        travle(root.left);
        list.add(root.val);
        travle(root.right);
    }*/
}
