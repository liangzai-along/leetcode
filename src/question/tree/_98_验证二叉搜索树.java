package question.tree;

import javax.swing.tree.TreeNode;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/19 10:45
 * 地址：https://leetcode-cn.com/problems/validate-binary-search-tree/
 */
public class _98_验证二叉搜索树 {
    /**
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
    // 节点实现不了的功能，可以通过辅助函数，增加函数参数列表，在参数汇总携带额外信息
    // 这里不是特别理解
    public boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) return true;
        if (min != null && root.val <= min.val) return false;
        if (max != null && root.val >= max.val) return false;
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
     */
}
