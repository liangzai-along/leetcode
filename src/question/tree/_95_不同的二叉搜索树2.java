package question.tree;

import datastructure.list.List;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/19 17:12
 * 地址：https://leetcode-cn.com/problems/unique-binary-search-trees-ii/
 * 解题：https://leetcode-cn.com/problems/unique-binary-search-trees-ii/solution/cong-gou-jian-dan-ke-shu-dao-gou-jian-suo-you-shu-/
 */
public class _95_不同的二叉搜索树2 {

/*
    // 构建一颗二叉搜索树
    public TreeNode helper(int start, int end) {

        if (start > end) return null;
        int val = (start + end) / 2;
        TreeNode root = new TreeNode(val);

        root.left = helper(start, val -1);
        root.right= helper(val + 1, end);

        return root;
    }

    public List<TreeNode> helper(int start, int end) {
        List<TreeNode> list = new ArrayList<>();
        if (start > end) {
            list.add(null);
            return list;
        }
        for (int i = start; i <= end; i++) {

            List<TreeNode> left = helper(start, i-1);
            List<TreeNode> right = helper(i+1, end);
            // 这里不是很明白
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    list.add(root);
                }
            }
        }
        return list;
    }*/
}
