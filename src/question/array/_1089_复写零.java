package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/29 14:46
 * 地址：https://leetcode-cn.com/problems/duplicate-zeros/
 */
public class _1089_复写零 {
    // 暴力解法思路：有0， 把后面的往后移，然后赋值
    public void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != 0) continue;
            // 等于0,则移位

            for(int j = arr.length - 2; j > i; j--) {
                arr[j+1] = arr[j];
            }
            arr[++i] = 0;
        }
    }
}
