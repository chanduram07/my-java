package dsa.maths;

/**
 * Problem Description
 * <p>
 * You are given two integers A and B.
 * <p>
 * You have to find the value of AB.
 * <p>
 * NOTE: The value of answer is always less than or equal to 109.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= A, B <= 1000
 * <p>
 * <p>
 * <p>
 * Input Format
 * <p>
 * First parameter is an integer A.
 * <p>
 * Second parameter is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * <p>
 * Return an integer.
 * <p>
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1:
 * <p>
 * A = 2
 * B = 3
 * Input 2:
 * <p>
 * A = 1
 * B = 10
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1:
 * <p>
 * 8
 * Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation
 * <p>
 * Explanation 1:
 * <p>
 * For A = 2 and B = 3, the value of 23 = 2 * 2 * 2 = 8.
 * Explanation 2:
 * <p>
 * For A = 1 and B = 10, the value of 110 = 1.
 */
public class Power {

    public static void main(String[] args) {
        System.out.println(power(10, 9));
    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int power(final int A, final int B) {
        int pow = A;

        for (int i = 1; i <= B - 1; i++) {
            pow = pow * A;
        }

        return pow;
    }
}
