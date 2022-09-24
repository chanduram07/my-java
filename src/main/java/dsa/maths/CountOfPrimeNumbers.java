package dsa.maths;

/**
 * You will be given an integer n. You need to return the count of prime numbers less than or equal to n.
 * <p>
 * <p>
 * Problem Constraints
 * 0 <= n <= 10^3
 * <p>
 * <p>
 * Input Format
 * Single input parameter n in function.
 * <p>
 * <p>
 * Output Format
 * Return the count of prime numbers less than or equal to n.
 * <p>
 * <p>
 * Example Input
 * Input 1: 19
 * Input 2: 1
 * <p>
 * <p>
 * Example Output
 * Output 1: 8
 * Output 2: 0
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1: Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19
 * Explanation 2: There are no primes <= 1
 */
public class CountOfPrimeNumbers {

    public static void main(String[] args) {
        System.out.println(solve(1000));
    }

    public static int solve(int A) {
        int count = 0;

        if (A == 0 || A == 1) {
            return count;
        }

        for (int i = 2; i <= A; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        return count;
    }

}
