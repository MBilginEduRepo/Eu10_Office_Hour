package week16;

import java.util.function.*;

public class Test {

    public static void main(String[] args) {
//       TestFunctionalInterface findSquare = (n) -> {
//           return n*n;
//       };
//        System.out.println(findSquare.apply(5));

//        one();
//        two();
        three();
    }


    public static void one() {

        Predicate<Integer> canVote = (n) -> {
            if (n >= 18) {
                return true;
            }
            return false;
        };

        System.out.println(canVote.test(15));
    }

//    public static void canVote(int n){
//        if(n >= 18){
//            System.out.println("You can vote");
//        }else{
//            System.out.println("you can't vote");
//        }
//    }

    public static void two() {
        Consumer<String> printName = (name) -> {
            System.out.println("The user is called " + name);
        };

        printName.accept("John");
    }

    public static void three() {
        Function<Integer, String> printAge = (age) -> {
            String result = "The user is " + age + " years old";
            return result;
        };
        System.out.println(printAge.apply(18));
    }



}
