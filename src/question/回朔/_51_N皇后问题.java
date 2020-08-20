package question.回朔;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/19 19:27
 * 地址：https://leetcode-cn.com/problems/n-queens/
 * 参考：https://leetcode-cn.com/problems/n-queens/solution/hui-su-suan-fa-xiang-jie-by-labuladong/
 */
public class _51_N皇后问题 {

    List<List<String>> res;
    public List<List<String>> solveNQueens(int n) {
        res = new LinkedList<>();
        char[][] board = new char[n][n];
        for (char[] chars : board) Arrays.fill(chars, '.');
        backtrack(0, board);
        return res;
    }
    // 辅助函数
    private static List<String> charToString(char[][] array) {
        List<String> result = new LinkedList<>();
        for (char[] chars : array) {
            result.add(String.valueOf(chars));
        }
        return result;
    }
    public void backtrack(int row, char[][] board) {
        // 终止条件
        if(row == board.length) {
            res.add(charToString(board));
            return;
        }
        int n = board[row].length;
        for(int col = 0; col < n; col++){
            // 排除不合法选择
            if (!isValid(board, row, col)) {
                continue;
            }
            // 选择
            board[row][col] = 'Q';
            // 进行下一行决策
            backtrack(row+1, board);
            // 撤销选择
            board[row][col] = '.';
        }
    }
    // // 检查列是否有皇后互相冲突
    private boolean isValid(char[][] board, int row, int col) {
        int rows = board.length;
        // 检查列是否有皇后互相冲突
        for (char[] chars : board) if (chars[col] == 'Q') return false;
        // 检查右上方是否有皇后互相冲突
        for (int i = row - 1, j = col + 1; i >= 0 && j < rows; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
        //  检查左上方是否有皇后互相冲突
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }

}
