package question.topk;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/16 15:43
 * 地址：https://leetcode-cn.com/problems/top-k-frequent-elements/
 */
public class _347_前K个高频元素 {
    // hashMap统计次数，然后再增加难度
    public int[] topKFrequent(int[] nums, int k) {
        // 次数映射
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int[] res = new int[k];
        // 利用堆来处理前K的类型
        PriorityQueue<Map.Entry<Integer, Integer>> maxheap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxheap.offer(entry);
        }
        for (int i = 0; i < k; i++) {
            res[i] = maxheap.poll().getKey();
        }
        return res;
    }

}
