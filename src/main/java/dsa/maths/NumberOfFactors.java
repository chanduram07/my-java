package dsa.maths;

/**
 * Problem Description
 * Given an integer A, you need to find the count of it's factors.
 * <p>
 * Factor of a number is the number which divides it perfectly leaving no remainder.
 * <p>
 * Example : 1, 2, 3, 6 are factors of 6
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A <= 109
 * <p>
 * <p>
 * Input Format
 * First and only argument is an integer A.
 * <p>
 * <p>
 * Output Format
 * Return the count of factors of A.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * 5
 * Input 2:
 * 10
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 2
 * Output 2:
 * 4
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * Factors of 5 are 1 and 5.
 * Explanation 2:
 * Factors of 10 are 1, 2, 5 and 10.
 */
public class NumberOfFactors {

    public static void main(String[] args) {
        System.out.println(factors(26));
    }

    public static int factors(int N) {
        int count = 0;

        int sqrtOfN = squareRoot(N);

        //for(int i=1;i<=N/i;i++)
        for (int i = 1; i <= sqrtOfN; i++) {
            if (N % i == 0) {
                if (i != N / i) {
                    count = count + 2;
                } else {
                    count = count + 1;
                }
            }
        }
        return count;
    }

    public static int squareRoot(int N) {
        int sqrt = 0;

        for (int i = 1; i <= N; i++) {

            if (i * i <= N) {
                sqrt = i;
            } else {
                break;
            }
        }
        return sqrt;
    }
}
