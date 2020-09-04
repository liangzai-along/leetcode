package question.tree;

import javax.swing.tree.TreeNode;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/4 20:33
 * 地址：https://leetcode-cn.com/problems/diameter-of-binary-tree/
 */
public class _543_二叉树的直径 {
    // 思路：转换为左右子节点高度和最大
/*    int ans = 1;
    public int diameterOfBinaryTree(TreeNode root) {
        deep(root);
        return ans-1;
    }

    public int deep(TreeNode root) {
        if (root == null) return 0;
        int Left = deep(root.left);
        int right = deep(root.right);
        ans = Math.max(ans, Left + right + 1);
        // 注意这个返回值，并不是需要求的东西
        return Math.max(Left, right) + 1;
    }*/
}
