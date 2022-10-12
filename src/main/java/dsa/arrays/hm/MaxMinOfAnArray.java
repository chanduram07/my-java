package dsa.arrays.hm;


/**
 * Problem Description
 * Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * -109 <= A[i] <= 109
 * <p>
 * <p>
 * Input Format
 * First argument A is an integer array.
 * <p>
 * <p>
 * Output Format
 * Return the sum of maximum and minimum element of the array
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [-2, 1, -4, 5, 3]
 * Input 2:
 * <p>
 * A = [1, 3, 4, 1]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * 5
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1.
 * Explanation 2:
 * <p>
 * Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.
 */
public class MaxMinOfAnArray {

    public static void main(String[] args) {

        int[] arr = {1, 5, 9};
        System.out.println(solve(arr));

    }

    public static int solve(int[] A) {

        int min = Integer.MAX_VALUE; //2147483647 A constant holding the maximum value an int can have, 2^31 -1.
        int max = Integer.MIN_VALUE; //-2147483648 A constant holding the minimum value an int can have, -2^31.

        System.out.println("max: " + max + ", min: " + min);

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }

            if (A[i] < min) {
                min = A[i];
            }
        }


        return max + min;
    }
}
