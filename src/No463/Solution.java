package No463;

/**
 * Created by Wang jf on 2017/6/15.
 */
public class Solution {
    public static int islandPermeter(int[][] grid) {
        int res = 0;
        int rows = grid.length;
        for (int i = 0; i < rows; i++) {
            int[] columns = grid[i];
            for (int j = 0; j < columns.length; j++) {
                if (grid[i][j] != 0) {
                    res += 4;
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                        res--;
                    }
                    if (i + 1 < rows && grid[i + 1][j] == 1) {
                        res--;
                    }
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                        res--;
                    }
                    if (j + 1 < columns.length && grid[i][j + 1] == 1) {
                        res--;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0},{1,1,0,0}};

        System.out.println(islandPermeter(grid));
    }
}
