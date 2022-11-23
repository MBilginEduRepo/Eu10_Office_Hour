package week6;

import java.util.*;

public class WhilePractices {

    public static void main(String[] args) {
//        one();
//        two();
//        three();
//        four();
//        practice5();
        six();
    }

    public static void one() {
        int count = 1;
        while (count <= 10) {
            count *= 2;
        }
        count = count - 10;  // 16-10 = 6
        System.out.println("count = " + count);
        /*
        loop    count
        1         2
        2         4
        3         8
        4         16
         */
    }

    public static void two() {
        int count = 100;
        while (count < 100) {
            count = count + 1;
        }
        System.out.println("count = " + count);
    }

    public static void three() {
        int i = 1;
        do {
            if (i % 2 == 0)
                System.out.print(" " + i);
//            i++;
        } while (i < 11);
    }

    public static void four() {
        for (int i = 1; i < 50; i++) {
            if (i % 5 != 0) {
                continue;
            }

            System.out.println(i);
        }
    }

    // print only vowels in given word
    // a, e, i, o, u      home --> o, e

    public static void practice5(){
        String data = "";
        String str="abcdefghijklmnopqrstuvwxyz";
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='u'||ch=='i'||ch=='o'){
                result+=ch;            }
        }
        System.out.println(result);
    }

    // while loop password checker, 3 guess
    public static void six(){
        String password = "Cydeo123!";
        Scanner scanner = new Scanner(System.in);
        int guessNo = 0;

        while (true){
            System.out.println("Please enter your password");
            String guess = scanner.nextLine();
            if (guess.equals(password)){
                System.out.println("Welcome to dashboard");
                break;
            }
            guessNo++;
            if(guessNo == 3){
                System.out.println("Your account is deactivated");
                break;
            }
        }
    }
}
