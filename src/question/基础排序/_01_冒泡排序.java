package question.基础排序;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/11/17 20:21
 */
public class _01_冒泡排序 {

    public void bubbleSort(int[] array) {
        if (array == null || array.length < 2) return;
        for (int end = array.length-1; end > 0; end--) {
            for (int i = 1; i < end; i++) {
                if (array[i] > array[i+1]) {
                    swap(array, i, i+1);
                }
            }
        }
    }
    // 交换
    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
