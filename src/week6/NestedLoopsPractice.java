package week6;

import java.util.*;

public class NestedLoopsPractice {

    public static void main(String[] args) {
//        one();
//        two();
        three();
    }

    // multiplication  table
    public static void one() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
/*
1 x 1 = 1
1 x 2 = 2
1 x 3 = 3
1 x 4 = 4
1 x 5 = 5
1 x 6 = 6
1 x 7 = 7
1 x 8 = 8
1 x 9 = 9
1 x 10 = 10
 */
    }

    // input a number, use 3 number smaller or equal to that number,
    // make combination that sum of that 3 number is equal to the number you input.
    // 2 --> 6
    /*
002
011
020
101
110
200
     */
    // 3 --> 10
    // 5 --> 21
    public static void two(){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int total = 0;
        for (int i = 0; i <= number ; i++) {
            for (int j = 0; j <=number ; j++) {
                for (int k = 0; k <=number ; k++) {
                    if(i + j + k == number){
                        System.out.println("" + i + j + k);
                        total ++;
                    }
                }
            }
        }
        System.out.println(total);
    }

           /*
1
22
333
4444
55555
         */
    public static void three(){
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }


}
