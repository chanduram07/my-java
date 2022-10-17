package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem Description
 * You are given an array A of N integers.
 * Return a 2D array consisting of all the subarrays of the array
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 100
 * 1 <= A[i] <= 105
 * <p>
 * <p>
 * Input Format
 * First argument A is an array of integers.
 * <p>
 * <p>
 * Output Format
 * Return a 2D array of integers
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = [1, 2, 3]
 * Input 2:
 * A = [5, 2, 1, 4]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
 * Output 2:
 * [[5], [5, 2], [5, 2, 1], [5, 2, 1, 4], [2], [2, 1], [2, 1, 4], [1], [1, 4], [4]]
 * <p>
 * <p>
 * Example Explanation
 * For Input 1:
 * All the subarrays of the array are returned. There are a total of 6 subarrays.
 * For Input 2:
 * All the subarrays of the array are returned. There are a total of 10 subarrays.
 */
public class GenerateAllSubarrays {

    public static void main(String[] args) {

        /*int[] A = {36, 63, 63, 26, 87, 28, 77, 93, 7};
        int[][] subArr = solve1(A);

        for (int i = 0; i < subArr.length; i++) {
            for (int j = 0; j < subArr[i].length; j++) {
                System.out.print(subArr[i][j] + ",");
            }
            System.out.println();
        }*/

        int[] A = {36, 63, 63, 26, 87, 28, 77, 93, 7};

        ArrayList<Integer> al = new ArrayList<>();
        al.add(36);
        al.add(63);
        al.add(63);
        al.add(26);
        al.add(87);
        al.add(28);
        al.add(77);
        al.add(93);
        al.add(7);
        ArrayList<ArrayList<Integer>> result = solve1(al);

        System.out.print(result.toString());
    }


    /**
     * Oracle JDK 1.8
     *
     * @param A
     * @return
     */
    public static ArrayList<ArrayList<Integer>> solve1(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.size(); j++) {
                ArrayList<Integer> al = new ArrayList<Integer>();
                for (int k = i; k <= j; k++) {
                    al.add(A.get(k));
                }
                result.add(al);

            }
        }
        return result;
    }


    /**
     * Java 8 Array Support.
     *
     * @param A
     * @return
     */
    public static int[][] solve(int[] A) {

        int numOfSubArrays = (A.length * (A.length + 1)) / 2;

        int[][] result = new int[numOfSubArrays][];
        int resultIndex = 0;


        for (int i = 0; i < A.length; i++) {

            for (int j = i; j < A.length; j++) {

                int[] subArr = new int[j - i + 1];

                int subArrIndex = 0;
                for (int k = i; k <= j; k++) {
                    subArr[subArrIndex] = A[k];
                    subArrIndex++;
                }
                result[resultIndex] = subArr;
                resultIndex++;
            }
        }

        return result;
    }
}
