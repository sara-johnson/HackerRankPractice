package AmazonOA;

import java.util.Arrays;

public class MaxOfMinAltitudes {

    private int[][] cache;

    public int maxOfMinAltitudes(int[][] grid) {

        cache = new int[grid.length][grid[0].length];
        // initialize the values in the cache to mark
        // subproblems that haven't yet been calculated
        for (int[] arr: cache)
            Arrays.fill(arr, -5);
        // call top down memo method
        return helper(grid, grid.length - 1, grid[0].length - 1);

    }

    private int helper(int[][] grid, int row, int col) {
        // invalid if we go off the grid
        if (row < 0 || col < 0)
            return Integer.MAX_VALUE;
        // check to see if already calculated
        if (cache[row][col] != -5)
            return cache[row][col];

        // calculate left and above subproblems
        int left = helper(grid, row, col - 1);
        int above = helper(grid, row - 1, col);

        // if both left and above are invalid
        if (left == Integer.MAX_VALUE && above == Integer.MAX_VALUE)
            cache[row][col] = grid[row][col];
            // if left is invalid
        else if (left == Integer.MAX_VALUE)
            cache[row][col] = grid[row][col] + above;
            // if above is invalid
        else if (above == Integer.MAX_VALUE)
            cache[row][col] = grid[row][col] + left;
            // if both are valid, take the min
        else
            cache[row][col] = grid[row][col] + Math.min(left, above);

        return cache[row][col];
    }
}
