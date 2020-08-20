package question.递归;

import javax.swing.tree.TreeNode;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/18 10:51
 * 地址：https://leetcode-cn.com/problems/longest-univalue-path/
 * 参考：https://leetcode-cn.com/problems/longest-univalue-path/solution/guan-yu-di-gui-si-lu-de-chao-xiang-xi-ge-ren-jian-/
 */
public class _687_最长同值路径 {
    /*int ans = 0;
    public int longestUnivaluePath(TreeNode root) {
        longestUnivaluePathHelper(root);
        return ans;
    }
    public int longestUnivaluePathHelper(TreeNode root) {

        if (root == null) return 0;
        int temp = 0;
        // 理解这个函数的作用,返回最长路径
        // 左子树和右子树返回各自的最长路径
        int left = longestUnivaluePathHelper(root.left);
        int right = longestUnivaluePathHelper(root.right);

        // 然后分情况，讨论根结点和左右子树根结点的情况
        // 如果都相等
        if (root.left != null && root.right != null && root.left.val == root.val && root.right.val == root.val) {
            // 加两条边
            ans = Math.max(ans, left + right + 2);
        }
        if (root.left != null && root.left.val == root.val) {
            temp = left + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            temp = Math.max(temp, right+1);
        }
        ans = Math.max(temp, ans);
        // 注意理解这里的返回值
        return temp;

    }*/
}
