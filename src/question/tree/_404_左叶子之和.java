package question.tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/4 15:26
 * 地址：https://leetcode-cn.com/problems/sum-of-left-leaves/
 */
public class _404_左叶子之和 {
    // 思路：层序遍历
/*    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        List<TreeNode> list = new ArrayList<>();
        int sum = 0;
        list.add(root);
        while (!list.isEmpty()) {
            List<TreeNode> treeNodes = new ArrayList<>();
            for (TreeNode t : list) {
                // 判断左子节点
                if (t.left != null && t.left.left == null && t.left.right == null) {
                    sum += t.left.val;
                }
                if (t.left != null) {
                    treeNodes.add(t.left);
                }
                if (t.right != null) {
                    treeNodes.add(t.right);
                }
            }
            list = treeNodes;
        }
        return sum;
    }*/
}
