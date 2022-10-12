package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersInArray {

    public static void main(String[] args) {

        //int[] arr = {16, 17, 4, 3, 5, 2};
        int[] arr = {1, 2};

        System.out.println(Arrays.toString(solve(arr)));

    }

    public static int[] solve(int[] A) {

        int maxNum = Integer.MIN_VALUE;
        List<Integer> intArr = new ArrayList<>();

        for (int i = A.length - 1; i >= 0; i--) {

            if (A[i] > maxNum) {
                intArr.add(A[i]);
                maxNum = A[i];
            }

        }

        //System.out.println(count);


        //System.out.println(intArr.toString());

        return intArr.stream().mapToInt(i -> i).toArray();


    }
}
