package question.tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/4 9:54
 * 地址:https://leetcode-cn.com/problems/balanced-binary-tree/
 */
public class _110_平衡二叉树 {
/*    // 思路：求高度，然后递归
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int diff = high(root.left) - high(root.right);
        int res = diff > 0 ? diff : - diff;
        if (res > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    // 求高度：两个存储节点，一个遍历，一个在遍历中记录下一层节点
    public int high(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 存储每一层的节点
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        int count = 0;
        while (!list.isEmpty()) {
            count++; // 层数
            // 记录下一层的节点
            List<TreeNode> treeNodes = new ArrayList<>();
            for (TreeNode t : list) {
                if (t.left != null) {
                    treeNodes.add(t.left);
                }
                if (t.right != null) {
                    treeNodes.add(t.right);
                }
            }
            list = treeNodes;
        }
        return count;
    }*/
}
