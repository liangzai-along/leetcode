package question.tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/3 9:53
 * 地址：https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
 */
public class _107_二叉树的层次遍历2 {
    // 思路：反转的问题，栈和递归
    // 思路： 每一层需要一个容器存储这一层的节点，还需要一个容器存储值
 /*   List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return res;
        List<TreeNode> list = new ArrayList<>();
        Stack<List<Integer>> stack = new Stack<>();
        list.add(root); // 存储每层的节点
        // 访问每一层要做两件事，第一遍历值，记录下一层的所有节点
        while (!list.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            List<TreeNode> treeNodes = new ArrayList<>();
            // 遍历一层的节点
            for (TreeNode t : list) {
                // 添加值
                temp.add(t.val);
                // 添加节点
                if (t.left != null) {
                    treeNodes.add(t.left);
                }
                if (t.right != null) {
                    treeNodes.add(t.right);
                }
            }
            // 存入栈中
            stack.add(temp);
            // 更新容器
            list = treeNodes;
        }
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }*/
}
