package dsa.arrays.hm;

/**
 * Problem Description
 * You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 105
 * <p>
 * 0 <= A[i] <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument is an integer array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the second largest element. If no such element exist then return -1.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [2, 1, 2]
 * Input 2:
 * <p>
 * A = [2]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * -1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * First largest element = 2
 * Second largest element = 1
 * Explanation 2:
 * <p>
 * There is no second largest element in the array.
 */
public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {1, 5, 9};
        System.out.println(solve(arr));
    }

    public static int solve(int[] A) {

        int largest = -1;
        int secLargest = -1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > largest) {
                secLargest = largest;
                largest = A[i];

            }
            // Condition && A[i] != largest [ 13, 7, 16, 18, 14, 17, 18, 8, 10 ]
            else if (A[i] > secLargest && A[i] != largest) {
                secLargest = A[i];
            }
        }

        return secLargest;

    }
}
