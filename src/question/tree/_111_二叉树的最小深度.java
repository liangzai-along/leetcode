package question.tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/4 11:05
 * 地址：https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 */
public class _111_二叉树的最小深度 {
    // 思路：每一层查找，子节点，然后层数就是最小深度，
    // 思路：层序遍历的变形
/*    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        int count = 0;
        while (!list.isEmpty()) {
            count++;
            List<TreeNode> treeNodes = new ArrayList<>();
            for (TreeNode t : list) {
                if (t.left == null && t.right == null){
                    return count;
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
        return count;
    }*/
}
