package dsa.arrays;

import java.util.Arrays;

/**
 * Problem Description
 * Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A.size() <= 104
 * <p>
 * 1 <= A[i] <= 109
 * <p>
 * 1 <= B <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is an integer array A.
 * <p>
 * Second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return 1 if good pair exist otherwise return 0.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1,2,3,4]
 * B = 7
 * Input 2:
 * <p>
 * A = [1,2,4]
 * B = 4
 * Input 3:
 * <p>
 * A = [1,2,2]
 * B = 4
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * 0
 * Output 3:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * (i,j) = (3,4)
 * Explanation 2:
 * <p>
 * No pair has sum equal to 4.
 * Explanation 3:
 * <p>
 * (i,j) = (2,3)
 */
public class GoodPair {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        //int[] arr = {2, 5, 6};
        int b = 7;


        System.out.println(solve(arr, b));

    }

    public static int solve(int[] A, int B) {

        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (A[i] + A[j] == B) {
                    return 1;
                }
            }
        }

        return 0;
    }

}
