package question.递归;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/7 19:36
 * 地址：https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/submissions/
 */
public class _783_二叉搜索树节点最小距离 {
    // 二叉搜索树===中序遍历
/*    List<Integer> list = new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        int res = list.get(1)-list.get(0);
        for (int i = 2; i < list.size(); i++) {
            int temp = list.get(i) - list.get(i-1);
            if (temp < res) {
                res = temp;
            }
        }
        return res;
    }

    // 中序遍历
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }*/
}
