package week4;

import java.util.*;

public class ScannerClass {

    public static void main(String[] args) {

        String name = "Mike";
        Scanner input = new Scanner(System.in);

//        System.out.println("Please enter your name");
//        String nameUser = input.nextLine();
//        System.out.println("nameUser = " + nameUser);
//
//        System.out.println("please enter your age");
//        int age = input.nextInt();
//        System.out.println("age = " + age);

        System.out.println("please enter full name");
        String fullName = input.next();
        System.out.println("fullName = " + fullName);

        // ctrl + /

        System.out.println("please enter full name");
        String fullName1 = input.nextLine();
        System.out.println("fullName = " + fullName1);



    }
}
