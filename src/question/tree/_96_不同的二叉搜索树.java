package question.tree;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/19 16:34
 * 地址：https://leetcode-cn.com/problems/unique-binary-search-trees/
 */
public class _96_不同的二叉搜索树 {
    public int numTrees(int n) {
        if (n == 0 || n == 1) return 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            // 去除根结点
            sum += numTrees(i) * numTrees(n-i-1);
        }
        return sum;
    }
}
