package datastructure.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/5 17:04
 */
//在二维数组中找值
public class FindNumInArray {
    public static void main(String[] args) {
        int[] array = {4,6};
        int low = 0 ; int high = array.length - 1;
        while(low <= high){
            int mid = (high + low) >> 1;
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;//如果小，则本身也可能是最小的一个哦
            }
        }
        int b = array[low];
    }

    //数组无规律时的查找-查找特定的数
    public int findTarget(int[] array, int target){
        for (int i = 0;i < array.length;i++){
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }

    //数组无规律时的查找-查找最小的数,需要借助一个变量来保存最小的值，查找都需要遍历数组
    public int findMin(int[] array, int target){
        int min = array[0];
        for (int i = 1;i < array.length;i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    //数组无规律时的查找-查找最大的数
    public int findMax(int[] array){
        int max = array[0];
        for (int i = 1;i < array.length;i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 数组有规律时的查找-查找特定的数
     * 思路：有序查找二分法
     * @param array
     * @param target
     * @return
     */
    public static int findTargetInSortArray(int[] array, int target){
        int low = 0;
        int high = array.length-1;

        while (low <= high){
            int mid = (low + high)/2;
            if (array[mid] == target){
                return mid;
            }else if (array[mid] > target){
                high = mid;
            }else {
                high = high - 1;
            }
        }
        return -1;
    }

    //暴力搜索，适合二维数组没有规律
    public boolean soluation(int[][] array,int target){
        for (int [] rows:array){
            for (int i = 0;i < rows.length;i++){
                if (rows[i] == target){
                    return true;
                }
            }
        }
        return false;
    }
    //规律法
    public boolean find(int[][] array,int target){
        int row = 0;
        int col = array[0].length - 1;
        while (row < array[0].length && col >= 0) {
            if (array[row][col] == target) {
                return true;
            } else if (array[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
    //二分查找法，每行一次二分查找
    public boolean findBin(int[][] array, int target){
        for (int i = 0;i < array[0].length;i++){
            int low = 0;
            int high = array[0].length - 1;
            while (low <= high){
                int mid = (low + high)/2;
                if (array[i][mid] == target){
                    return true;
                }else if (array[i][mid] > target){
                    high = mid -1;
                }else {
                    low = mid + 1;
                }
            }
        }
        return false;
    }

    public int search(int[] array){
        int low = 0;
        int high = array.length - 1;
        while (low <= high){
            int mid = (low + high)/2;
            if (array[mid] > array[high]){
                low = mid + 1;
            }else if (array[mid] < array[high]){
                high = high - 1;
            }else {
                high = mid;//如果小，本身也可能是
            }
        }
        return array[low];
    }

    public void findNumsAppearOnce(int[] num1,int[] num2,int[] array){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (hm.containsKey(array[i])){
                hm.put(array[i],2);
            }else {
                hm.put(array[i],1);
            }
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (hm.get(array[i]) == 1){
                if (count == 0){
                    num1[0] = array[i];
                }else {
                    num2[0] = array[i];
                }
            }
        }
        //int count = 0;
        //for (HashMap.Entry<Integer,Integer> entry:hm.entrySet()){
        //    if (entry.getKey() == 1){
        //        if (count == 0){
        //            num1[0] = entry.getValue();
        //            count++;
        //        }else {
        //            num2[0] = entry.getValue();
        //        }
        //    }
        //}
    }
}
