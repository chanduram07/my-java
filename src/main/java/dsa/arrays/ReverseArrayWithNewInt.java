package dsa.arrays;

import java.util.Arrays;

public class ReverseArrayWithNewInt {

    public static void main(String[] args) {

        //int[] N = {1, 2, 3, 2, 1};
        //int[] N = {1, 2, 10};

        int[] N = new int[10000];


        for (int i = 0; i < 10000; i++) {
            N[i] = i;
        }


        System.out.println(Arrays.toString(solve(N)));

    }


    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int[] solve(final int[] A) {

        int[] reversed = new int[A.length];

        int j = 0;
        for (int i = A.length - 1; i >= 0; i--) {

            reversed[j] = A[i];
            j++;
        }


        return reversed;
    }
}

