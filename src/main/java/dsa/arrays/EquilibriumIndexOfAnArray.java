package dsa.arrays;

import java.util.Arrays;

/**
 * Problem Description
 * You are given an array A of integers of size N.
 * <p>
 * Your task is to find the equilibrium index of the given array
 * <p>
 * The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
 * <p>
 * NOTE:
 * <p>
 * Array indexing starts from 0.
 * If there is no equilibrium index then return -1.
 * If there are more than one equilibrium indexes then return the minimum index.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * -105 <= A[i] <= 105
 * <p>
 * <p>
 * Input Format
 * First arugment is an array A .
 * <p>
 * <p>
 * Output Format
 * Return the equilibrium index of the given array. If no such index is found then return -1.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A=[-7, 1, 5, 2, -4, 3, 0]
 * Input 2:
 * <p>
 * A=[1,2,3]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 3
 * Output 2:
 * <p>
 * -1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * 3 is an equilibrium index, because:
 * A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 * Explanation 1:
 * <p>
 * There is no such index.
 */
public class EquilibriumIndexOfAnArray {

    public static void main(String[] args) {
        //int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int[] arr = {1, 2, 3};
        System.out.println(solve(arr));
    }

    public static int solve(int[] A) {

        int[] ps = new int[A.length];
        ps[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            ps[i] = ps[i - 1] + A[i];
        }

        System.out.println(Arrays.toString(ps));

        for (int i = 0; i < ps.length; i++) {

            int leftSum = i == 0 ? 0 : ps[i - 1];

            int rightSum = ps[ps.length - 1] - ps[i];

            if (leftSum == rightSum) {
                return i;
            }

        }

        return -1;

    }
}
