package datastructure.sort;


import datastructure.tools.Integers;
import datastructure.tools.Times;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/10 15:22
 */
public class BubbleSort {

    public static void main(String[] args) {
        Integer[] random = Integers.random(10, 1, 100);

        Integers.println(random);
    }

    public static void bubbleSort(Integer[] array){
        //定义冒泡到哪，也就是末尾已经拍好序的不参与比较
        for (int end = array.length - 1; end > 0; end--){
            //假定此轮扫描的数组是有序的
            boolean sorted = true;
            //一轮冒泡
            for (int begin = 0; begin < end; begin++){
                //交换
                if (array[begin] > array[begin+1]){
                    int temp = array[begin];
                    array[begin] = array[begin+1];
                    array[begin+1] = temp;
                    //进入if程序，说明数组无序
                    sorted = false;
                }
            }
            //终止程序
            if (sorted){
                break;
            }
        }
    }

    /**
     * 优化2：如果数组尾部局部有序，则后面不参与比较；未优化前，end是end--
     * 优化后让每次让end等于尾部排好序的第一个数字（也就是交互的最后一个数字）
     * @param array
     */
    public static void bubbleSort2(Integer[] array){
        //定义冒泡到哪，也就是末尾已经拍好序的不参与比较
        for (int end = array.length - 1; end > 0; end--){
            //sortedIndex=1；如果本身就是有序则直接停止冒泡，用于判断完全有序
            int sortedIndex = 1;
            //一轮冒泡
            for (int begin = 0; begin < end; begin++){
                //交换
                if (array[begin] > array[begin+1]){
                    int temp = array[begin];
                    array[begin] = array[begin+1];
                    array[begin+1] = temp;
                    sortedIndex = begin + 1;
                }
            }
            end = sortedIndex;
        }
    }

}
