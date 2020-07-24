package datastructure.sort;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/9 10:10
 */

//直接插入法
public class InsertSort {

    public static void insertSort(int[] array){

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1]){
                int temp = array[i];
                int j = 0;
                for (j = i -1; i >= 0 && temp < array[j];i --){
                    //移动
                    array[j + 1] = array[j];
                }
                //插入
                array[j + 1] = temp;
            }
        }
    }
}
