package question.排序;

import java.util.Arrays;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/11/24 22:30
 */
public class _40_最小的k个数 {
    //  利用随机快排
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        return quickSort(arr, 0 ,arr.length-1, k-1);
    }
    public int[] quickSort(int[] arr, int left, int right, int k) {
        swap(arr, left+(int)Math.random()*(right-left+1), right);
        int[] p = partition(arr, left, right);
        if (p[0] == k) {
            return Arrays.copyOf(arr, k+1);
        }
        return p[0] > k ? quickSort(arr, left, p[0]-1, k) : quickSort(arr, p[0]+1, right, k);
    }
    public int[] partition(int[] arr, int left, int right) {
        int less = left - 1;
        int more = right + 1;
        int cur = left;
        int target = arr[right];
        while (cur < more) {
            if (arr[cur] < target) {
                swap(arr, ++less, cur++);
            } else if (arr[cur] > target) {
                swap(arr, --more, cur);
            } else {
                cur++;
            }
        }
        return new int[] {less+1, more-1};
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
