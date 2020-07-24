package datastructure.test;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/10 11:25
 */


public class Demo02 {
    public static void main(String[] args) {
        System.out.println(fib1(19));
        System.out.println(fib2(19));
    }
    //菲薄纳妾
    public static int fib1(int n){
        if (n <= 1){
            return n;
        }else {
            return fib1(n-1) + fib1(n-2);
        }
    }
    //动态规划
    public static int fib2(int n){
        if (n <= 1){
            return n;
        }else {
            int first = 0;
            int second = 1;
            for (int i = 2; i <= n; i++) {
                int sum = first + second;
                first = second;
                second = sum;
            }
            return second;
        }
    }

    public static int sum(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }
}
