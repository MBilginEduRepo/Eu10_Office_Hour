package week7;

public class ForEachLoopIntro {
    public static void main(String[] args) {

//        int num[] = {1, 2, 3, 4, 5, 6, 7, 8};
//        for (int number : num) {
//            System.out.println(number);
//        one();
        two();
    }

    // create email list as @gmail for given names
//    {"Harold","Jack","Ahmet","Sakushi"};

    public static void one() {
        String[] names = {"Harold", "Jack", "Ahmet", "Sakushi"};
        for (String name : names) {
            System.out.println(name + "@gmail.com");
        }
    }

    // String[] names = {"Harold8000", "Jack3000", "Ahmet6000", "Sakushi7000"};
    // use Integer.valueOf(String)  to convert String to int
    public static void two() {
        String[] names = {"Harold8000", "Jack3000", "Ahmet6000", "Sakushi7000"};
        int total = 0;
        for (String name : names) {
            total += Integer.valueOf(name.substring(name.length()-4));
        }

        String number = "100";
        int num = Integer.valueOf(number);
        System.out.println("total = " + total);
    }


}



