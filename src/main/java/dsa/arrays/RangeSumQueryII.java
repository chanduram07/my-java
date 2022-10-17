package dsa.arrays;

import java.util.Arrays;

/**
 * Problem Description
 * You are given an integer array A of length N.
 * You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
 * For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
 * More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N, M <= 103
 * 1 <= A[i] <= 105
 * 1 <= L <= R <= N
 * <p>
 * <p>
 * Input Format
 * The first argument is the integer array A.
 * The second argument is the 2D integer array B.
 * <p>
 * <p>
 * Output Format
 * Return an integer array of length M where ith element is the answer for ith query in B.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * B = [[1, 4], [2, 3]]
 * Input 2:
 * <p>
 * A = [2, 2, 2]
 * B = [[1, 1], [2, 3]]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * [10, 5]
 * Output 2:
 * <p>
 * [2, 4]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * The sum of all elements of A[1 ... 4] = 1 + 2 + 3 + 4 = 10.
 * The sum of all elements of A[2 ... 3] = 2 + 3 = 5.
 * Explanation 2:
 * <p>
 * The sum of all elements of A[1 ... 1] = 2 = 2.
 * The sum of all elements of A[2 ... 3] = 2 + 2 = 4.
 */
public class RangeSumQueryII {
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{1, 4}, {2, 3}};

        System.out.println(Arrays.toString(solve(A, B)));


    }

    public static int[] solve(int[] A, int[][] B) {

        int[] result = new int[B.length];

        for (int i = 0; i < B.length; i++) {
            int l = B[i][0];
            int r = B[i][1];

            int sum = 0;
            for (int k = l - 1; k <= r - 1; k++) {
                sum += A[k];
            }
            result[i] = sum;
        }
        return result;
    }
}
