package question.tree;

import javax.swing.tree.TreeNode;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/4 14:21
 * 地址：https://leetcode-cn.com/problems/path-sum/
 */
public class _112_路径总和 {
    // 递归问题
/*    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        // 终止条件
        if (root.left == null && root.right == null) {
            return root.val == sum;
        }
        // 等价方程
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }*/
}
