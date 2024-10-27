package DSA;

import java.util.PriorityQueue;

public class GreedyPathMatrix {
    private static final int[][] directions = {
        {-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}
    }; // All 8 possible moves

    public static boolean findPath(int[][] matrix) {
        int n = matrix.length;
        boolean[][] visited = new boolean[n][n];
        int x = 0, y = 0;

        // PriorityQueue to select the highest-value neighbor
        PriorityQueue<Cell> pq = new PriorityQueue<>((a, b) -> b.value - a.value);

        while (x != n - 1 || y != n - 1) {
            visited[x][y] = true; // Mark current cell as visited

            // Check all 8 neighbors
            boolean hasValidNeighbor = false;
            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                if (isValid(nx, ny, n) && matrix[nx][ny] != -1 && !visited[nx][ny]) {
                    pq.offer(new Cell(nx, ny, matrix[nx][ny]));
                    hasValidNeighbor = true;
                }
            }

            if (!hasValidNeighbor) {
                System.out.println("NO POSSIBLE PATH due to BLOCKs on every side.");
                return false;
            }

            // Move to the cell with the maximum value
            Cell next = pq.poll();
            x = next.x;
            y = next.y;
            pq.clear(); // Clear the queue for the next iteration
        }

        System.out.println("Path found to reach the goal at (" + x + ", " + y + ").");
        return true;
    }

    private static boolean isValid(int x, int y, int n) {
        return x >= 0 && y >= 0 && x < n && y < n;
    }

    private static class Cell {
        int x, y, value;

        Cell(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {0, -1, -1, 1, 1, 1, 0},
            {-1, 2, 5, 4, 10, 3, -1},
            {3, 2, -1, -1, 0, 3, 8},
            {7, -1, 10, 2, -1, -1, 17},
            {4, 3, 9, -1, 1, 8, 33},
            {17, -1, -1, -1, 0, 44, 100}
        };

        findPath(matrix);
    }
}
