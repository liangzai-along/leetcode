package question.tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/3 10:42
 * 地址：https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 */
public class _144_二叉树的前序遍历 {
    // 思路：使用递归和迭代两种方法
    //============基于递归：简单易于理解和实现===========//
    //List<Integer> res = new ArrayList<>();
    //public List<Integer> preorderTraversal(TreeNode root) {
    //    if (root == null) return res;
    //    res.add(root.val);
    //    preorderTraversal(root.left);
    //    preorderTraversal(root.right);
    //    return res;
    //}

    // 基于迭代
/*    List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return res;
        // 模拟递归，需要一个栈来模拟系统栈，存放节点
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode cur = root;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            // 前序，先添加
            res.add(node.val);
            // 后面为了先弹出左边，要先把右边先压入栈
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        return res;
    }*/
}
