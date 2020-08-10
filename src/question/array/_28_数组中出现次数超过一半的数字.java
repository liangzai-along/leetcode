package question.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/10 10:28
 * 地址：https://www.nowcoder.com/practice/e8a1b01a2df14cb2b228b30ee6a92163?tpId=13&&tqId=11181&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 *
 */
public class _28_数组中出现次数超过一半的数字 {

    /**
     * 利用哈希原理的数组
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        int[] hashtable = new int[100];
        for (int i = 0; i < array.length; i++) {
            if (hashtable[array[i]] > 0) {
                hashtable[array[i]] += 1;
                // 提前结束
                if (hashtable[array[i]] > array.length/2) {
                    return array[i];
                }
            }else {
                hashtable[array[i]] = 1;
            }
        }
        return 0;
    }

    /**
     * 基于hashmap
     * @param array
     * @return
     */
    public int solution(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int value;
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i],1);
            }else {
                value = map.get(array[i]);
                map.put(array[i],value +1);
                // 提前结束
                if (value + 1 > array.length/2) {
                    return array[i];
                }
            }
        }
        return 0;
    }

}
