package question.BFS;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/9/28 18:58
 * 地址：https://leetcode-cn.com/problems/as-far-from-land-as-possible/submissions/
 */
public class _1162_地图分析 {
    public int maxDistance(int[][] grid) {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    queue.offer(new int[] {i, j});
                }
            }
        }
        boolean hasOcean = false;
        int[] point = null;
        while (!queue.isEmpty()) {
            point = queue.poll();
            int x = point[0], y = point[1];
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if (newX < 0 || newX >= grid.length || newY >= grid[0].length || newY < 0 || grid[newX][newY] != 0) {
                    continue;
                }
                grid[newX][newY] = grid[x][y] + 1;
                hasOcean = true;
                queue.offer(new int[] {newX, newY});
            }
        }
        if (!hasOcean || point == null) {
            return -1;
        }
        return grid[point[0]][point[1]] - 1;
    }
}
