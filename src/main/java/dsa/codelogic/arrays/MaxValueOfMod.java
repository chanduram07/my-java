package dsa.codelogic.arrays;

import java.util.Arrays;

public class MaxValueOfMod {

    public static void main(String[] args) {

        int[] A = {2, 6, 4}; // 4
        //int[] A = {1, 2, 44, 3}; //3
        //int[] A = {1, 2, 3, 3}; //2
        System.out.println(solve(A));

    }

    public static int solve(int[] A) {

        int max = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(A));

        for (int j= A.length-1; j>=0;j-- )
        {
            if (A[j-1] != A[j])
            {
                return A[j-1] % A[j];
            }
            continue;
        }

        return 0;

    }
}
