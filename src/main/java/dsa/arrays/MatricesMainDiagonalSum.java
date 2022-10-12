package dsa.arrays;

import java.util.Arrays;

public class MatricesMainDiagonalSum {

    public static void main(String[] args) {

       /* int[][] array = {{1, -2, -3},
                {-4, 5, -6},
                {-7, -8, 9}};
*/

        int[][] array = {{3, 2},
                {2, 3}};


        System.out.println(solve(array));

    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int solve(final int[][] A) {

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i][i];
        }
        return sum;
    }
}
