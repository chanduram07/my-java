package dsa.arrays;

import java.util.Arrays;

/**
 * Problem Description
 * Given an array A of length N, return the subarray from B to C.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * <p>
 * 1 <= A[i] <= 109
 * <p>
 * 0 <= B <= C < N
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument A is an array of integers
 * <p>
 * The remaining argumens B and C are integers.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a subarray
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = [4, 3, 2, 6]
 * B = 1
 * C = 3
 * Input 2:
 * <p>
 * A = [4, 2, 2]
 * B = 0
 * C = 1
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * [3, 2, 6]
 * Output 2:
 * <p>
 * [4, 2]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * The subarray of A from 1 to 3 is [3, 2, 6].
 * Explanation 2:
 * The subarray of A from 0 to 1 is [4, 2].
 */
public class SubarrayInGivenRange {

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 6};
        int b = 1;
        int c = 3;

        System.out.println(Arrays.toString(solve(arr, b, c)));

    }

    public static int[] solve(int[] A, int B, int C) {

        int[] subArr = new int[C - B + 1];
        int subArrInd = 0;

        for (int i = B; i <= C; i++) {
            subArr[subArrInd] = A[i];
            subArrInd++;
        }

        return subArr;
    }
}
