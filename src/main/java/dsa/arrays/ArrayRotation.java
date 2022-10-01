package dsa.arrays;

import java.util.Arrays;

/**
 * Problem Description
 * Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <=109
 * 1 <= B <= 109
 * <p>
 * <p>
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is the integer B.
 * <p>
 * <p>
 * Output Format
 * Return the array A after rotating it B times to the right
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 2, 3, 4]
 * B = 2
 * Input 2:
 * <p>
 * A = [2, 5, 6]
 * B = 1
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [3, 4, 1, 2]
 * Output 2:
 * <p>
 * [6, 2, 5]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]
 * Explanation 2:
 * <p>
 * Rotate towards the right 1 time - [2, 5, 6] => [6, 2, 5]
 */
public class ArrayRotation {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        //int[] arr = {2, 5, 6};
        int b = 1000000000;


        System.out.println(Arrays.toString(solve(arr, b)));
    }

    public static int[] solve(int[] A, int B) {

        // Because we no need to rotate more then size of the array times.
        B = B % A.length;

        A = reverse(A, 0, A.length - 1);
        A = reverse(A, 0, B - 1);
        A = reverse(A, B, A.length - 1);

        return A;


    }

    public static int[] reverse(int[] A, int B, int C) {

        // j is to come from end of the array
        int j = C;
        for (int i = B; i < j; i++) {

            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;

            j--;
        }

        return A;
    }


}
