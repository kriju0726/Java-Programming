// #1314 leetcode.com/problem/matrix-block-sum

import java.util.*;

public class MatrixBlockSum {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] prefixSum = new int[m + 1][n + 1];

        // Build the prefix sum matrix
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = mat[i - 1][j - 1]
                                + prefixSum[i - 1][j]
                                + prefixSum[i][j - 1]
                                - prefixSum[i - 1][j - 1];
            }
        }

        int[][] result = new int[m][n];

        // Calculate the block sum for each element
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int r1 = Math.max(0, i - K);
                int c1 = Math.max(0, j - K);
                int r2 = Math.min(m - 1, i + K);
                int c2 = Math.min(n - 1, j + K);

                result[i][j] = prefixSum[r2 + 1][c2 + 1]
                             - prefixSum[r1][c2 + 1]
                             - prefixSum[r2 + 1][c1]
                             + prefixSum[r1][c1];
            }
        }

        return result;
    }

    // ✅ Optional: for local testing (not needed in LeetCode)
    public static void main(String[] args) {
        MatrixBlockSum obj = new MatrixBlockSum();
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int K = 1;

        int[][] res = obj.matrixBlockSum(mat, K);

        // Print result
        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }
}
