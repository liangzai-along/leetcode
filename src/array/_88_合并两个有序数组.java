package array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/16 20:20
 * 地址：https://leetcode-cn.com/problems/merge-sorted-array/
 * 总结答题套路：
 * 1：前面是容器+变量存储数据；难点在于容器的选择，已经利用变量进行优化
 * 2：循环；难点在于循环的条件；条件都是边界
 * 3：判断：难点在于判断的条件；条件都是边界
 * 4：特殊情况的判断：一般是边界
 */
public class _88_合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int cur = m + n - 1;
        int i1 = m -1;
        int i2 = n -1;
        //循环边界条件
        while (i2 >= 0){
            if (i1 < 0){
                nums1[cur--] = nums2[i2--];
                continue;
            }
            //正常都是这种；然后开始判断特殊边界
            nums1[cur--] = nums1[i1] > nums2[i2] ? nums1[i1--]:nums2[i2--];
        }
    }

}
