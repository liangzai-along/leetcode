package question.tree;

import javax.swing.tree.TreeNode;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/4 20:18
 * 地址：https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
 */
public class _538_把二叉搜索树转换为累加树 {
    // 思路：二叉搜索树===中序遍历,
    // 把中序遍历反过来，这样就可以累加了
/*    int num = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        convertBST(root.right);
        root.val = root.val + num;
        num = root.val;
        convertBST(root.left);
        return root;
    }*/
}
