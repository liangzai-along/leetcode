package question.topk;

import java.util.Arrays;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/16 16:02
 * 地址：https://leetcode-cn.com/problems/smallest-k-lcci/
 */
public class _1714_最小K个元素 {
    public int[] smallestK(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }

}
