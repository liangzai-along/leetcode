package datastructure.sort;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/11 15:13
 */
public class SelectSort {
    public static void main(String[] args) {

    }

    public static void selectSort(Integer[] array){

        for (int end = array.length - 1; end > 0; end--){
            //记录最大元素位置
            int maxIndex = 0;
            for (int begin = 0; begin <= end; begin++){
                if (array[begin] >= array[maxIndex]){
                    maxIndex = begin;
                }
            }
            //交换位置
            int temp = array[end];
            array[end] = array[maxIndex];
            array[maxIndex] = temp;

        }
    }
}
