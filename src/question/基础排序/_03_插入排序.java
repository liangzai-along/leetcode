package question.基础排序;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/11/17 20:32
 */
public class _03_插入排序 {

    public void insertSort(int[] array) {
        if (array == null || array.length < 2) return;
        for (int i = 1; i < array.length; i++) {
            for (int j = i-1; j >=0 && array[j] > array[j+1];j--) {
                swap(array, j, j+1);
            }
        }
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
