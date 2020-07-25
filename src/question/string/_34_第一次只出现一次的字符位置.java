package question.string;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/25 21:12
 * 地址：https://www.nowcoder.com/practice/1c82e8cf713b4bbeb2a5b31cf5b0417c?tpId=13&&tqId=11187&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */

/**
 * 设计出现次数问题，可以利用哈希
 */
public class _34_第一次只出现一次的字符位置 {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0){
            return -1;
        }
        int[] hashtable = new int[256];
        for (int i = 0; i < str.length(); i++){
            if (hashtable[str.charAt(i)] > 0){
                hashtable[str.charAt(i)] += 1;
            }else {
                hashtable[str.charAt(i)] = 1;
            }
        }

        for (int i = 0; i < str.length(); i++){
            if (hashtable[str.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }
}
