package dsa.arrays.hm;

/**
 * Problem Description
 * <p>
 * Given an array A and an integer B, find the number of occurrences of B in A.
 * <p>
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= B, Ai <= 109
 * 1 <= |A| <= 105
 * <p>
 * <p>
 * Input Format
 * <p>
 * Given an integer array A and an integer B.
 * <p>
 * <p>
 * Output Format
 * <p>
 * Return an integer, number of occurrences of B in A.
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1:
 * A = [1, 2, 2], B = 2
 * Input 2:
 * A = [1, 2, 1], B = 3
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1:
 * 2
 * Output 2:
 * 0
 * <p>
 * <p>
 * Example Explanation
 * <p>
 * Explanation 1:
 * Element at index 2, 3 is equal to 2 hence count is 2.
 * Explanation 2:
 * There is no element equal to 3 in the array.
 */
public class LinearSearchMultipleOccurences {

    public static void main(String[] args) {

        //int[] arr = {1, 5, 9};
        int[] arr = {1, 2, 2};
        System.out.println(solve(arr, 3));

    }

    public static int solve(int[] A, int B) {

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B) {
                count++;
            }
        }

        return count;
    }
}
