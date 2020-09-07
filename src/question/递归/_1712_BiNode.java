package question.递归;

import javax.swing.tree.TreeNode;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/7 19:37
 * 地址：https://leetcode-cn.com/problems/binode-lcci/
 */
public class _1712_BiNode {
/*    public TreeNode convertBiNode(TreeNode root) {
        TreeNode head = new TreeNode(0);
        dfs(root, head);
        return head.right;
    }

    public TreeNode dfs(TreeNode root, TreeNode prev) {
        if (root != null) {
            prev = dfs(root.left, prev);

            root.left = null;
            prev.right = root;
            prev = root;
            prev = dfs(root.right, prev);
        }
        return prev;
    }*/
}
