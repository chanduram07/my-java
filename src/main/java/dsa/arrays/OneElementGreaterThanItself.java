package dsa.arrays;

/**
 * Problem Description
 * Given an array A of N integers. Count the number of elements that have at least 1 elements greater than itself.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <= 109
 * <p>
 * <p>
 * Input Format
 * First and only argument is an array of integers A.
 * <p>
 * <p>
 * Output Format
 * Return the count of elements.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = [3, 1, 2]
 * Input 2:
 * A = [5, 5, 3]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 2
 * Output 2:
 * 1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * The elements that have at least 1 element greater than itself are 1 and 2
 * Explanation 2:
 * The elements that have at least 1 element greater than itself is 3
 */
public class OneElementGreaterThanItself {

    public static void main(String[] args) {

        int[] N = {1, 5, 8, 2, -1, 6};
        System.out.println(countOfElements(N));

    }

    public static int countOfElements(int[] N) {

        int maxCount = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < N.length; i++) {
            if (N[i] > maxNum) {
                maxNum = N[i];
                maxCount = 1;
            } else if (N[i] == maxNum) {
                maxCount++;
            }
        }

        return N.length - maxCount;

    }
}
