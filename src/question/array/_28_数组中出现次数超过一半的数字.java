package question.array;

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
        int[] hashtable = new int[100];
        for (int i = 0; i < array.length; i++) {
            if (hashtable[array[i]] > 0) {
                hashtable[array[i]] += 1;
            }else {
                hashtable[array[i]] = 1;
            }
        }
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] > array.length/2){
                return i;
            }
        }
        return 0;
    }

}
