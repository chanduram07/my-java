package dsa.arrays;

import java.util.Arrays;

public class ReverseSubArray {

    public static void main(String[] args) {

        //int[] arr = {1, 2, 3, 4};
        int[] arr = {2, 5, 6};
        int b = 0;
        int c = 2;

        System.out.println(Arrays.toString(reverse(arr, b, c)));
    }

    public static int[] reverse(int[] A, int B, int C) {

        // j is to come from end of the array
        int j = C;
        for (int i = B; i < j; i++) {

            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;

            j--;
        }

        return A;
    }
}