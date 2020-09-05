package question.排序;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/5 20:28
 * 地址：https://leetcode-cn.com/problems/intersection-of-two-arrays/
 */
public class _349_两个数组的交集 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }
            }
        }
        int[] res = new int[set.size()];
        Iterator it = set.iterator();
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) it.next();
        }
        return res;
    }
}
