package question.基础排序;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/11/19 21:20
 */
public class _04_归并排序 {

    public static void main(String[] args) {
        int[] arr = {5,4,2,1,7,9};
        sortProcess(arr,0,arr.length-1);
    }

    public static void sortProcess(int[] arr, int left, int right) {
        if (left == right) return;
        int mid = left + ((right-left)>>1);
        sortProcess(arr,left,mid);
        sortProcess(arr,mid+1,right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] help = new int[right-left+1];
        int i = 0;
        int p1 = left;
        int p2 = right;
        while (p1 <= mid && p2 <= right) {
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid) {
            help[i++] = arr[p1++];
        }
        while (p2 <= right) {
            help[i++] = arr[p2++];
        }
        for (int j = 0; j < help.length; j++) {
            arr[left+j] = help[j];
        }
    }
}
