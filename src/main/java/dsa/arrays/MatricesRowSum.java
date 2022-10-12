package dsa.arrays;

import java.util.Arrays;

/**
 * Q2. Row Sum
 * Solved
 * character backgroundcharacter
 * Stuck somewhere?
 * Ask for help from a TA and get it resolved.
 * Get help from TA.
 * Problem Description
 * You are given a 2D integer matrix A, return a 1D integer array containing row-wise sums of original matrix.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A.size() <= 103
 * <p>
 * 1 <= A[i].size() <= 103
 * <p>
 * 1 <= A[i][j] <= 103
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument A is a 2D array of integers.(2D matrix).
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an array conatining row-wise sums of original matrix.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * [1,2,3,4]
 * [5,6,7,8]
 * [9,2,3,4]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * {10,26,18}
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1
 * <p>
 * Row 1 = 1+2+3+4 = 10
 * Row 2 = 5+6+7+8 = 26
 * Row 3 = 9+2+3+4 = 18
 */
public class MatricesRowSum {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 2, 3, 4}};

        System.out.println(Arrays.toString(solve(array)));
    }

    public static int[] solve(int[][] A) {

        int[] sumArr = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = 0; j < A[i].length; j++) {
                sum += A[i][j];
            }
            sumArr[i] = sum;
        }

        return sumArr;
    }
}
