package question.递归;

import datastructure.list.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/11 19:50
 * 地址：https://www.nowcoder.com/practice/fe6b651b66ae47d7acce78ffdd9a96c7?tpId=13&&tqId=11180&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 *
 */
public class _27_字符串的排列 {

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.length() == 0) return res;
        char[] cs = str.toCharArray();
        PermutationHelper(cs, res,0);
        Collections.sort(res);
        return res;
    }

    /**
     * 核心就是：让第一个数和其他所有不同的数进行交换，然后剩下的进行全排列
     * @param cs
     * @param begin
     */
    public void PermutationHelper(char[] cs, ArrayList<String> res, int begin) {
        if (begin == cs.length) {
            if (!res.contains(new String(cs))) {
                res.add(new String(cs));
            }
        } else {
            for (int i = begin; i < cs.length; i++) {
                /**
                 * 这里是核心
                 */
                swap(cs, i, begin);
                PermutationHelper(cs, res, begin + 1);
                swap(cs, i, begin);
            }
        }

    }

    /**
     * 交换位置
     * @param cs
     * @param i
     * @param j
     */
    public void swap (char[] cs, int i, int j) {
        if (i != j) {
            char temp = cs[i];
            cs[i] = cs[j];
            cs[j] = temp;
        }
    }
}
