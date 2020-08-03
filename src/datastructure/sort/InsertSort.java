package datastructure.sort;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/9 10:10
 */

//直接插入法
public class InsertSort {

    public static void insertSort(int[] array){

        for (int begin = 1; begin < array.length; begin++) {
            int cur = begin;
            while (cur > 0 && array[cur-1] > array[cur]){
                int temp = array[cur];
                array[cur] = array[cur-1];
                array[cur-1] = temp;
                cur--;
            }
        }
    }
}
