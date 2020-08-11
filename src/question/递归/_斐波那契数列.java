package question.递归;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/11 18:39
 */
public class _斐波那契数列 {

    /**
     * 判断是否可以利用递归：能否将问题拆成小问题，分解
     * 递归操作三要素：
     * 1.明白函数的作用
     * 2.找到函数和下一个函数的关系 fib(n) = fib(n-1) + fib(n-2)
     * 3.找到边界条件
     */
    public int fib (int n) {
        if (n <= 2) return 1;
        return fib(n-1) + fib(n - 2);
    }

    /**
     * 递归优化1：记忆法
     * 递归有多余的重复计算，利用数组进行保存，从而减少重复的计算
     * 把保存好的数组作为参数传入
     * @param n
     * @return
     */
    public int fib2 (int n) {
        if (n <= 2) return 1;
        int[] array = new int[n+1];
        array[2] = array[1] = 1;
        return fib3(array, n);
    }

    public int fib3 (int[] array, int n){
        if (array[n] == 0) {
            return fib3(array, n-1) + fib3(array, n-3);
        }
        return array[n];
    }

    /**
     * 利用数组去除递归调用
     * @param n
     * @return
     */
    public int fib4 (int n) {
        if (n <= 2) return 1;
        int[] array = new int[n+1];
        array[2] = array[1] = 1;
        for (int i = 0; i <= n; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array[n];
    }


    /**
     * 利用两个变量，动态规划
     * @param n
     * @return
     */
    public int fib5 (int n) {
        if (n <= 2) return 1;
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            second = first + second;
            first = second - first;
        }
        return second;
    }

 }
