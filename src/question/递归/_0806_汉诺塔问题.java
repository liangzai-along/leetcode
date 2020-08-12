package question.递归;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/12 19:36
 * 地址：https://leetcode-cn.com/problems/hanota-lcci/
 */



public class _0806_汉诺塔问题 {

    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        hanotaHelper( A, B, C, A.size());
    }

    public void hanotaHelper(List<Integer> A, List<Integer> B, List<Integer> C, int n) {
        if (n == 1) {
            C.add(A.get(A.size()-1));
            A.remove(A.size()-1);
        }else{
            /**
             * 相当于是两个的操作，理解这个函数的操作的作用是什么：把A换道C上面
             */
            // A放到B上
            // 理解函数的作用
            hanotaHelper(A, C, B, n-1);
            // A放到C上
            C.add(A.get(A.size()-1));
            A.remove(A.size()-1);
            // B放到C上
            hanotaHelper(B, A, C, n-1);
        }

    }

}
