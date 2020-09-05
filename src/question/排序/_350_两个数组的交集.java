package question.排序;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/5 20:46
 */
public class _350_两个数组的交集 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    array.add(nums1[i]);
                    nums2[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
        int[] res = new int[array.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = array.get(i);
        }
        return res;
    }
}
