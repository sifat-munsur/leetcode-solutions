package Matrix;

import java.util.*;

class DeleteGreatestValueEachRow {
    public static void main(String[] args) {
        int[][] grid = {{1,2,4},{3,3,1}};
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            Arrays.sort(grid[i]);
        }
        int ans = 0;
        for (int j = n - 1; j >= 0; j--) {
            int max = 0;
            for (int i = 0; i < m; i++) {
                max = Math.max(max, grid[i][j]);
            }
            ans += max;
        }
        System.out.println(ans);
    }
}
