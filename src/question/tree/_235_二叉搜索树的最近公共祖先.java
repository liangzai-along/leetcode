package question.tree;

import javax.swing.tree.TreeNode;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/4 14:37
 * 地址：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class _235_二叉搜索树的最近公共祖先 {
    // 树的问题：先想递归，二叉搜索树利用特性,左小右大
/*    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ((root.val - p.val) * (root.val - q.val) <= 0 ) return root;
        if ((root.val < p.val && root.val < q.val)) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return lowestCommonAncestor(root.left, p, q);
        }
    }*/
}
