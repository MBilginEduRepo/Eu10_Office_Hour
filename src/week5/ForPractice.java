package week5;

import java.util.*;

public class ForPractice {

    public static void main(String[] args) {
//        practice1();
//        practice2();
//        practice3();
        practice4();

    }

    // count from 0 to 10;
    public static void practice1(){
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }

    // Write a program to calculate the sum of first 10 natural number.
    public static void practice2(){
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    //Write a program that prompts the user to input a positive integer.
    // It should then print the multiplication table of that number.
    public static void practice3(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

    /*

     *
     **
     ***
     ****
     *****

     */
    public static void practice4(){
        for (int i = 1; i < 6; i++) {
            System.out.println("*".repeat(i));
        }
    }
}

