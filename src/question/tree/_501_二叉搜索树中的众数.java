package question.tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/4 16:06
 * 地址：https://leetcode-cn.com/problems/find-mode-in-binary-search-tree/
 */
public class _501_二叉搜索树中的众数 {
/*
    List<Integer> res = new ArrayList<>();
    // 有序数列找众数，双指针
    TreeNode pre = null; // 和谁比较
    int curCount = 1; // 当前数出现的次数
    int maxCount = 1; // 目前为止出现最大数

    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        midTraversal(root);
        // 最后一点处理
        if (curCount > maxCount) return new int[]{pre.val};
        if (curCount == maxCount) res.add(pre.val);
        int[] out = new int[res.size()];
        for (int i = 0; i < out.length; i++) {
            out[i] = res.get(i);
        }
        return out;
    }
    public void midTraversal(TreeNode root) {
        if (root == null) return;
        midTraversal(root.left);
        // 处理众数
        if (pre != null) {
            if (root.val != pre.val) { // 上一个节点的数量统计结束，要看出现的次数
                if (curCount > maxCount) {
                    maxCount = curCount;
                    res.clear();
                    res.add(pre.val);
                } else if (curCount == maxCount) {
                    res.add(pre.val);
                }
                curCount = 1;// 当前节点和上一个节点不同，重置技术
            } else {
                curCount++;
            }
        }
        pre = root;

        midTraversal(root.right);
    }*/
}
