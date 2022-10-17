package dsa.arrays;


/**
 * Problem Description
 * You are given an integer array A of length N.
 * You have to find the sum of all subarray sums of A.
 * More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
 * A subarray sum denotes the sum of all the elements of that subarray.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= Ai <= 10 4
 * <p>
 * <p>
 * Input Format
 * The first argument is the integer array A.
 * <p>
 * <p>
 * Output Format
 * Return a single integer denoting the sum of all subarray sums of the given array.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = [1, 2, 3]
 * Input 2:
 * <p>
 * A = [2, 1, 3]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 20
 * Output 2:
 * <p>
 * 19
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
 * Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20
 * Explanation 2:
 * <p>
 * Similiar to the first example, the sum of all subarray sums for this array is 19.
 */

public class SumOfSumOfAllSubArray {

    public static void main(String[] args) {

        int[] A = {1, 3, 5};

        System.out.println(subarraySumBruteForce(A));
        System.out.println(subarraySumPrefixSum(A));
        System.out.println(subarraySumCarryForward(A));

    }

    /**
     * Time complexity id N^3 i think this can be done with N^2 using other techniques of array.
     *
     * @param A
     * @return
     */
    public static long subarraySumBruteForce(int[] A) {

        long sum = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {

                long subarraySum = 0;
                for (int k = i; k <= j; k++) {
                    subarraySum += A[k];
                }
                sum += subarraySum;
            }
        }
        return sum;
    }

    /**
     * In this solution space complexity is O(N) because we have to create PrefixSum array of same A size.
     * So carry forward technique is better approach.
     *
     * @param A
     * @return
     */
    public static long subarraySumPrefixSum(int[] A) {
        long sum = A[0];

        // prepare prefix sum array.
        int[] ps = new int[A.length];
        ps[0] = A[0];

        for (int i = 1; i < ps.length; i++) {
            ps[i] = A[i] + ps[i - 1];

            //This is for 0th index. (0,0) (0,1) (0,2)
            sum = sum + ps[i];
        }

        for (int i = 1; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                sum += ps[j] - ps[i - 1];
            }
        }
        return sum;
    }

    /**
     * Time complexity O(N), Space complexity O(1)
     *
     * @param A
     * @return
     */
    public static long subarraySumCarryForward(int[] A) {
        long sum = 0;

        for (int i = 0; i < A.length; i++) {
            int subArraySum = 0;
            for (int j = i; j < A.length; j++) {
                subArraySum = subArraySum + A[j];
                sum = sum + subArraySum;
            }
        }
        return sum;
    }
}