package dsa.arrays;

import java.util.Arrays;

public class MetricesColSum {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 2, 3, 4}};

        System.out.println(Arrays.toString(solve(array)));
    }


    public static int[] solve(int[][] A) {

        int[] colSum = new int[A[0].length];

        for (int j = 0; j < A[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                sum = sum + A[i][j];
            }

            colSum[j] = sum;
        }

        return colSum;
    }
}
