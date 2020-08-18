package question.递归;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/18 16:10
 * 地址：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/solution/mian-shi-ti-07-zhong-jian-er-cha-shu-by-leetcode-s/
 */
public class _07_重建二叉树 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        Map<Integer, Integer> indexMap = new HashMap<>();
        int length = preorder.length;
        for (int i = 0; i < length; i++) {
            indexMap.put(inorder[i],i);
        }
        TreeNode root = buildTree(preorder, 0, length-1, inorder, 0, length-1, indexMap);
        return root;
    }

    // 一般遇到树的问题，先考虑递归方法
    // 递归函数：函数的作用，函数的输入有哪些(前序，中序，开始结束 然后后面再看缺什么），返回什么：返回树TreeNode；函数和子问题建立关系
    // 终止条件
    public TreeNode buildTree(int[] preorder, int preorderStart, int preorderEnd, int[] inorder, int inorderStart, int inorderEnd,
                              Map<Integer, Integer> indexMap) {

        if (preorderStart > preorderEnd) {
            return null;
        }
        int rootVal = preorder[preorderStart];
        TreeNode root = new TreeNode(rootVal);
        // 终止条件
        if (preorderStart == preorderEnd) {
            return root;
        }
        // 建立函数和子函数的关系
        // 1：找到根节点在中序中的位置，这里有一个位置和指的映射，借助一个hash来实现

        int rootIndex = indexMap.get(rootVal);
        // 2：确认左右子树
        int leftNodes = rootIndex - inorderStart;
        int rightNodes = inorderEnd - rootIndex;
        // 3.子函数
        TreeNode leftSubtree = buildTree(preorder, preorderStart + 1, preorderStart + leftNodes, inorder, inorderStart, rootIndex - 1, indexMap);
        TreeNode rightSubtree = buildTree(preorder, preorderEnd - rightNodes + 1, preorderEnd, inorder, rootIndex + 1, inorderEnd, indexMap);

        root.left = leftSubtree;
        root.right = rightSubtree;
        return root;
    }


}
