package question.递归;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/7 10:10
 * 地址：https://leetcode-cn.com/problemset/all/?topicSlugs=recursion&difficulty=%E7%AE%80%E5%8D%95
 */
public class _938_二叉搜索树的范围和 {
    // 中序遍历
/*    List<Integer> list = new ArrayList<>();
    public int rangeSumBST(TreeNode root, int L, int R) {
        int res = 0;
        inorder(root);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= L && list.get(i) <= R) {
                res += list.get(i);
            }
        }
        return res;
    }

    //
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }*/
}
