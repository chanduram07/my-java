package dsa.maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * You are given an integer A. You need to print all the Armstrong Numbers between 1 to A.
 * <p>
 * If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
 * <p>
 * For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 500
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument is an integer A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer array of all the Armstrong numbers in range [1,A].
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * 5
 * Input 2:
 * <p>
 * 200
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * [1, 153]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * 1 is an armstrong number.
 * Explanation 2:
 * <p>
 * 1 and 153 are armstrong number under 200.
 */
public class ArmStrongNumber {

    public static void main(String[] args) {

        //System.out.println(1%10);

        System.out.println(Arrays.toString(solve(200)));

    }

    public static int[] solve(int A) {

        //How will you store when you do not have integers array size
        int armSum = 0;

        List<Integer> armStrongNum = new ArrayList<>();

        for (int i = 1; i <= A; i++) {

            int num = i;
            while (num > 0) {
                int remainder = num % 10;
                armSum = armSum + (remainder * remainder * remainder);

                int q = num / 10;
                num = q;
            }

            if (armSum == i) {
                armStrongNum.add(i);
            }
            armSum = 0;
        }

        int[] intArr = new int[armStrongNum.size()];
        int i = 0;
        for (Integer armNum : armStrongNum) {
            intArr[i] = armNum;
            i++;
        }

        return intArr;

    }

}
