package week7;

import java.util.*;

public class MultiDimensionalArrays {

    public static void main(String[] args) {
        //The N dimensional array is a container for (N-1) dimensional arrays
        // 2 d array has multiple 1d arrays
        // 3d arrays has multiple 2d arrays

        int[] numbers = new int[5]; // 1d
        int[][] numbers2d = new int[5][];
        int[][][] numbers3d = new int[5][][];

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(numbers2d));

        numbers[0] = 5;
        numbers2d[0] = new int[]{2,3,4};
        System.out.println(Arrays.deepToString(numbers2d));

        int[] element1 = {1,2,3};
        numbers2d[1] = element1;

        System.out.println(Arrays.deepToString(numbers2d));
        System.out.println(numbers2d[1][1]);
        System.out.println(Arrays.toString(numbers2d[0]));

        // how to get element?
        //     0         1        2
        //[[1, 2, 3], [0, 0], [7, 8, 9]]
        //  0  1  2    0  1    0  1  2






    }
}
