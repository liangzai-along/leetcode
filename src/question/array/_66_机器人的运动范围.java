package question.array;

import java.util.Stack;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/24 8:41
 * 地址：https://www.nowcoder.com/practice/6e5207314b5241fb83f2329e89fdecc8?tpId=13&&tqId=11219&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class _66_机器人的运动范围 {

    // 获取机器人能走的范围
    public int movingCount(int threshold, int rows, int cols) {
        // 边界判断
        if (threshold <= 0 || rows <=0 || cols <= 0) return 0;
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        // 辅助矩阵，记录已经遍历过的节点
        boolean[] visited = new boolean[rows * cols];

        int[][] xoy = {{0,1,0,-1},{1,0,-1,0}};

        stack.add(0);
        visited[0] = true;

        while (!stack.empty()) {
            int cur = stack.pop();
            count++;
            for (int i = 0; i < 4; i++) {
                int x = cur % cols + xoy[0][i];
                int y = cur / cols + xoy[1][i];
                int sum = getDigitSum(x) + getDigitSum(y);
                if (x >= 0 && x < cols && y >= 0 && y < rows &&
                        sum <= threshold && !visited[x + y*cols]) {
                    stack.add(x + y * cols);
                    visited[x + y * cols] = true;
                }
            }
        }
        return count;
    }
    // 获取输入数字的位和
    private static int getDigitSum(int i) {
        int sum = 0;
        while (i > 0) {
            System.out.println(i %10);
            sum += i % 10;
            i /= 10;
            System.out.println(i);
        }
        return sum;
    }
}
