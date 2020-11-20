package question.递归;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/11/20 16:22
 */
public class _左神_小和 {

    public static int mergeSort(int[] arr, int left, int right){
        if (left == right) return 0;
        int mid = left + ((right-left)>>1);
        // 小和等于左侧的小和+右侧的小和+合并过程中的小和
        return mergeSort(arr,left,mid)
                +mergeSort(arr,mid+1,right)
                +merge(arr,left,mid,right);
    }

    public static int merge(int[] arr, int left, int mid, int right) {
        int[] help = new int[right-left+1];
        int i = 0;
        int p1 = left;
        int p2 = mid+1;
        int res = 0;
        while (p1 <= mid && p2 <= right) {
            res += arr[p1] < arr[p2] ? (right-p2+1) * arr[p1] : 0;
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid) {
            help[i++] = arr[left++];
        }
        while (p2 <= right) {
            help[i++] = arr[p2++];
        }
        for (int j = 0; j < help.length; j++) {
            arr[left+j] = help[j];
        }
        return res;
    }
}
