package dsa.arrays;

import java.util.Arrays;

/**
 * Problem Description
 * You have given a string A having Uppercase English letters.
 * <p>
 * You have to find how many times subsequence "AG" is there in the given string.
 * <p>
 * NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= length(A) <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument is a string A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the answer.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = "ABCGAG"
 * Input 2:
 * <p>
 * A = "GAB"
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 3
 * Output 2:
 * <p>
 * 0
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Subsequence "AG" is 3 times in given string
 * Explanation 2:
 * <p>
 * There is no subsequence "AG" in the given string.
 */
public class SpecialSubsequencesAG {

    public static void main(String[] args) {

        //String str = "ABCGAG";
        String str = "GAB";

        System.out.println(solve(str));

    }

    public static int solve(String A) {
        int ans = 0;
        int countG = 0;

        for (int i = A.length() - 1; i >= 0; i--) {

            if (A.charAt(i) == 'G') {
                countG++;
            } else if (A.charAt(i) == 'A') {
                ans = ans + countG;
            }

        }
        return ans;


    }

}
