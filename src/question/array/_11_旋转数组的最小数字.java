package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/24 14:39
 * 地址：https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 */
public class _11_旋转数组的最小数字 {
    // public int minArray(int[] numbers) {
    //     // 暴力解法，没有用到性质
    //     int min = numbers[0];
    //     for (int i = 1; i < numbers.length; i++) {
    //         if (numbers[i] < min) {
    //             min = numbers[i];
    //         }
    //     }
    //     return min;
    // }

    // 利用递增排序数组的旋转性质, 双指针
    public int minArray(int[] numbers) {
        int first = 0;
        int second = 1;
        int res = numbers[0];
        while(second < numbers.length) {
            if (numbers[second] < numbers[first]) {
                res = numbers[second];
                break;
            }
            second++;
            first++;
        }
        return res;
    }
}
