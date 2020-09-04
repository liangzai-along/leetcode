package question.tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/4 19:22
 * 地址：https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
 */
public class _530_二叉搜索树的最小绝对差 {
    // 思路：二叉搜索树==中序遍历
    // 思路：二叉搜索树中序遍历之后是递增的，求相邻的绝对值就行，也不需要绝对值，只需要后面的减前面的就大于0
/*    List<Integer> res = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < res.size(); i++){
            min = Math.min(min, res.get(i)-res.get(i-1));
            // int temp = res.get(i) - res.get(i-1) > 0 ? res.get(i) - res.get(i-1) : res.get(i-1) - res.get(i);
            // if (temp < min) {
            //     min = temp;
            // }
        }
        return min;
    }

    public void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        res.add(root.val);
        inOrder(root.right);
    }*/
}
