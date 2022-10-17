package dsa.arrays.hm;

/**
 * You are given a string S, and you have to find all the amazing substrings of S.
 * <p>
 * An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
 * <p>
 * Input
 * <p>
 * Only argument given is string S.
 * Output
 * <p>
 * Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
 * Constraints
 * <p>
 * 1 <= length(S) <= 1e6
 * S can have special characters
 * Example
 * <p>
 * Input
 * ABEC
 * <p>
 * Output
 * 6
 * <p>
 * Explanation
 * Amazing substrings of given string are :
 * 1. A
 * 2. AB
 * 3. ABE
 * 4. ABEC
 * 5. E
 * 6. EC
 * here number of substrings are 6 and 6 % 10003 = 6.
 */
public class AmazingSubarrays {

    public static void main(String[] args) {

        System.out.println(solve("ABEC"));

    }

    public static int solve(String A) {
        int maxIndex = A.length() - 1;

        int amazingSubArrays = 0;
        for (int i = 0; i <= maxIndex; i++) {
            if (A.charAt(i) == 'A' || A.charAt(i) == 'a' || A.charAt(i) == 'E' || A.charAt(i) == 'e' || A.charAt(i) == 'I' || A.charAt(i) == 'i'
                    || A.charAt(i) == 'O' || A.charAt(i) == 'o' || A.charAt(i) == 'U' || A.charAt(i) == 'u') {
                amazingSubArrays += maxIndex - i + 1;
            }
        }

        return amazingSubArrays % 10003;
    }
}
