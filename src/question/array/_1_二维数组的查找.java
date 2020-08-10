package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/10 9:59
 * 地址：https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&&tqId=11154&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class _1_二维数组的查找 {

    /**
     * 规律查找
     * @param target
     * @param array
     * @return
     */
    public boolean find(int target, int[][] array) {

        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        } else {
            int row = 0;
            int col = array[0].length - 1;
            while (row < array.length && col >= 0) {
                if (array[row][col] == target) {
                    return true;
                }else if (array[row][col] > target) {
                    col--;
                }else {
                    row++;
                }
            }
            return false;
        }
    }

    /**
     * 二分查找
     */
    public boolean TwoFind(int target, int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }else {
            for (int i = 0; i < array.length; i++) {
                int low = 0;
                int high = array[i].length - 1;
                while (low <= high) {
                    int mid = (low + high) >> 1;
                    if (target > array[i][mid]) {
                        low = mid + 1;
                    }else if (target < array[i][mid]) {
                        high = mid -1;
                    }else {
                        return true;
                    }
                }

            }
            return false;
        }
    }
}
