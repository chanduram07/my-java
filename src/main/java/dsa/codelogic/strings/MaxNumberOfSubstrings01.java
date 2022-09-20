package dsa.codelogic.strings;

/**
 * Given a string A, A is made up of 0's and 1's. Break A into substrings such that , all broken substrings have equal number of 1's and 0's.
 * <p>
 * Find and return maximum number of substrings in which A can be broken.
 * <p>
 * <p>
 * Input Format
 * <p>
 * The only argument given is string A.
 * Output Format
 * <p>
 * Find and return maximum number of substrings in which A can be broken.
 * Constraints
 * <p>
 * 1 <= length of A <= 10^5
 * A will always have equal number of 0's and 1's
 * For Example
 * <p>
 * Input 1:
 * A = "011100"
 * Output 1:
 * 2
 * Explanation 1:
 * "01" + "1100"
 * <p>
 * Input 2:
 * A = "00011011"
 * Output 2:
 * 1
 * Explanation 2:
 * "00011011"
 */


public class MaxNumberOfSubstrings01 {

    public static void main(String[] args) {

        String inputStr = "00100000100101111111";

        System.out.println(approach1(inputStr));

        System.out.println("===============================================================================================");

        System.out.println(approach2(inputStr));


    }

    public static int approach1(String inputStr) {

        char[] chrArr = inputStr.toCharArray();

        int countOfZero = 0;
        int countOfOne = 0;
        int subStringCount = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            if (chrArr[i] == '0') {
                countOfZero++;
            } else if (chrArr[i] == '1') {
                countOfOne++;
            }

            if (countOfZero == countOfOne) {
                subStringCount++;
                countOfZero = 0;
                countOfOne = 0;
            }
        }

        return subStringCount;

    }

    public static int approach2(String inputStr) {

        int sum = 0;
        int subStrCount = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) == '0') {
                sum++;
            } else {
                sum--;
            }

            if (sum == 0) {
                subStrCount++;
            }
        }

        return subStrCount;

    }

}
