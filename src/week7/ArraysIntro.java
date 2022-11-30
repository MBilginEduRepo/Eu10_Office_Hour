package week7;

import java.util.*;

public class ArraysIntro {

    public static void main(String[] args) {
        //Array can hold multiple values
        // but varialbel can hold only one

        int[] nums;
        int number[];

        String[] names;
        String lastNames[];

        boolean[] isSunny = new boolean[7];
        boolean[] isSunnyAnkara = {true, false, true, false, true, false, true};

        System.out.println(Arrays.toString(isSunny));
        System.out.println(Arrays.toString(isSunnyAnkara));

        int numbers[] = new int[5];
        System.out.println(Arrays.toString(numbers));

        String gender[] = new String[6];
        System.out.println(Arrays.toString(gender));

//        int double boolean
//        String, Arrays

        numbers[0] = 5;
        numbers[1] = 50;
        numbers[2] = 500;
        numbers[3] = 5000;
        numbers[4] = 50000;
//        numbers[5] = 500000;
        System.out.println(Arrays.toString(numbers));


        isSunnyAnkara[0] = false;
        System.out.println(Arrays.toString(isSunnyAnkara));


    }


}
