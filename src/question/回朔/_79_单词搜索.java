package question.回朔;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/8/24 15:54
 * 地址：https://leetcode-cn.com/problems/word-search/
 */
public class _79_单词搜索 {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0) return false;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (backtrack(board, row, col, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean backtrack(char[][] board, int row, int col, String word, int k) {
        // 终止条件
        if (word.length() == k) {
            return true;
        }
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(k)) {
            return false;
        }

        char cur = board[row][col];
        // 避免重复
        board[row][col] = '#';
        // 行走策略,右-左-下-上
        if (backtrack(board, row+1, col, word, k+1)) {
            return true;
        } else if (backtrack(board, row-1, col, word, k+1)) {
            return true;
        } else if (backtrack(board, row, col+1, word, k+1)) {
            return true;
        } else if (backtrack(board, row, col-1, word, k+1)) {
            return true;
        } else {
            board[row][col] = cur;
        }
        return false;

    }
}
