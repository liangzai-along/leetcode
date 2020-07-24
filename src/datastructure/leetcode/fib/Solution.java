package datastructure.leetcode.fib;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/10 11:54
 */
//leetcode 509:斐波那契数列
public class Solution {
    public int fib(int N) {
        if (N <= 1){
            return N;
        }else {
            int first = 0;
            int second = 1;
            for (int i = 2; i <= N; i++) {
                int sum = first + second;
                first = second;
                second = sum;
            }
            return second;
        }
    }
}
