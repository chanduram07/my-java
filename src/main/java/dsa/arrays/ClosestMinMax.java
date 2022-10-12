package dsa.arrays;

import java.util.Arrays;

/**
 * Problem Description
 * Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
 * <p>
 * and at least one occurrence of the minimum value of the array.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 2000
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument is vector A
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 3]
 * Input 2:
 * <p>
 * A = [2]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 2
 * Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Only choice is to take both elements.
 * Explanation 2:
 * <p>
 * Take the whole array.
 */
public class ClosestMinMax {

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 1, 3, 1, 6, 4, 6};
        //int[] arr = {1, 3};
        //int[] arr = {2};
        System.out.println(solve(arr));

    }

    public static int solve(int[] A) {

        int[] minMax = findMinMax(A);
        int min = minMax[0];
        int max = minMax[1];

        if (min == max) {
            return 1;
        }

        int ans = A.length;
        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 0; i < A.length; i++) {

            if (A[i] == min) {

                if (maxIndex != -1) {
                    int len = i - maxIndex + 1;

                    if (len < ans) {
                        ans = len;
                    }
                }
                minIndex = i;


            } else if (A[i] == max) {

                if (minIndex != -1) {
                    int len = i - minIndex + 1;
                    if (len < ans) {
                        ans = len;
                    }
                }
                maxIndex = i;

            }

        }

        return ans;
    }

    public static int[] findMinMax(int[] A) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[] minMax = new int[2];

        for (int i = 0; i < A.length; i++) {

            if (A[i] > max) {
                max = A[i];
            }

            if (A[i] < min) {
                min = A[i];
            }
        }

        minMax[0] = min;
        minMax[1] = max;

        return minMax;
    }
}
