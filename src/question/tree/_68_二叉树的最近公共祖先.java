package question.tree;

import javax.swing.tree.TreeNode;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/4 14:56
 * 地址：https://leetcode-cn.com/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/
 */
public class _68_二叉树的最近公共祖先 {
    // 不是二叉搜索树
    /*public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return root;
        // 终止条件
        if (root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            // 说明左右两边都遇到了终止条件
            return root;
        }
        if (left != null) {
            // 说明右边没有遇到终止条件，而是到了null
            return left;
        }
        if (right != null) {
            return right;
        }
        return null;
    }*/
}
