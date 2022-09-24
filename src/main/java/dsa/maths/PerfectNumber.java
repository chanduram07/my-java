package dsa.maths;

/**
 * Problem Description
 * You are given an integer A. You have to tell whether it is a perfect number or not.
 * <p>
 * Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
 * <p>
 * A proper divisor of a natural number is the divisor that is strictly less than the number.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A <= 106
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument contains a single positive integer A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return 1 if A is a perfect number and 0 otherwise.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = 4
 * Input 2:
 * <p>
 * A = 6
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 0
 * Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * For A = 4, the sum of its proper divisors = 1 + 2 = 3, is not equal to 4.
 * Explanation 2:
 * <p>
 * For A = 6, the sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.
 */
public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println(solve(25));

    }

    public static int solve(int A) {

        if (A == 1) {
            return 0;
        }

        //This means any number is already divisible by 1 and itself, but condition is divisor is strictly less than given number so not adding that
        int sum = 1;
        for (int i = 2; i * i <= A; i++) {
            if (A % i == 0) {
                //Because when we are working with squarroot of N time complexity there will be 2 facotrs. i and A/i
                sum = sum + i;

                if (i != A / i)
                    sum = sum + (A / i);
            }
        }

        if (A == sum) {
            return 1;
        } else {
            return 0;
        }

    }
}
