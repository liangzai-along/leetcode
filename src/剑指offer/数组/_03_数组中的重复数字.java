package 剑指offer.数组;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/12/20 10:34
 */
public class _03_数组中的重复数字 {
    // 原地置换
    public int findRepeatNumber(int[] number) {
        for (int i = 0; i < number.length; i++) {
            while (number[i] != i) {
                if (number[i] == number[number[i]]) {
                    return number[i];
                }
                swap(number, number[i], i);
            }
        }
        return -1;
    }
    // 交换
    public void swap(int[] number, int i, int j) {
        int temp = number[i];
        number[i] = number[j];
        number[j] = temp;
    }
}
