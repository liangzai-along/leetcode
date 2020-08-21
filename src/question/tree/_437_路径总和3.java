package question.tree;

import javax.swing.tree.TreeNode;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/21 11:14
 * 地址：https://leetcode-cn.com/problems/path-sum-iii/
 * 参考：https://labuladong.gitbook.io/algo/suan-fa-si-wei-xi-lie/di-gui-xiang-jie
 */
public class _437_路径总和3 {


/*    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        // 双递归
        int me = count(root, sum);
        int left = pathSum(root.left, sum);
        int right = pathSum(root.right, sum);

        return me + left + right;
    }

    public int count(TreeNode node, int sum) {

        if (node == null) return 0;

        int isMe = (node.val == sum) ? 1 : 0;
        int left = count(node.left, sum - node.val);
        int right = count(node.right, sum - node.val);

        return isMe + left + right;
    }*/
}
