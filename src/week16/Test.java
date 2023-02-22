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
//        three();
//        four();
//        five();
//        six();
        seven();
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

    public static void four(){
        BiPredicate<String, String> longestStr = (str1, str2) -> {
            if(str1.length() >= str2.length()){
                return true;
            }else return false;
        };
        System.out.println(longestStr.test("house", "home"));
    }

    public static void five(){
        BiConsumer<String, String> login = (username, password) -> {
            System.out.println("please enter your " + username + " and " + password);

            };
        login.accept("abc.com","abc123");
    }

    public static void six(){
        BiFunction<Double, Double, Double> actualPrice = (price, discount) -> {
            Double finalPrice = price * (1-discount);
            return finalPrice;
        };

        System.out.println(actualPrice.apply(10.0, 0.1));

    }

    public static void seven(){
        BiFunction<String, String, String> email = (name, mail) -> {
            return name + "@" + mail;
        };

        System.out.println(email.apply("zulpikar", "gmail.com"));
    }




}
