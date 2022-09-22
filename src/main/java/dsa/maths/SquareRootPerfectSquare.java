package dsa.maths;

/**
 * Problem Description
 * <p>
 * Given a number A. Return square root of the number if it is perfect square otherwise return -1.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= A <= 108
 * <p>
 * <p>
 * <p>
 * Input Format
 * <p>
 * First argument is an integer A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * <p>
 * Return an integer which is the square root of A if A is perfect square otherwise return -1.
 * <p>
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1:
 * <p>
 * A = 4
 * Input 2:
 * <p>
 * A = 1001
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1:
 * <p>
 * 2
 * Output 2:
 * <p>
 * -1
 * <p>
 * <p>
 * Example Explanation
 * <p>
 * Explanation 1:
 * <p>
 * sqrt(4) = 2
 * Explanation 2:
 * <p>
 * 1001 is not a perfect square.
 */
public class SquareRootPerfectSquare {

    public static void main(String[] args) {

        System.out.println(solve(26));
    }

    public static int solve(int A) {

        for (int i = 1; i <= A; i++) {
            int product = i * i;
            if (product == A) {
                return i;
            } else if (product > A) {
                return -1;
            }
        }

        return -1;
    }
}
