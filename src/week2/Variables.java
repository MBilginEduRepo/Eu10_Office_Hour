package week2;

public class Variables {

    public static void main(String[] args) {

        byte number = 12;
        byte number1 = -32;

//        byte wrongNumber = 65220;   // -128   127


        short number2 = 32000;
        short number3 = 5;

        int number4 = 15201458;

        long number5 = 15200000000000L;

        float number6 = 3.1F;

        // long num= 100; ( when we dont put l or L why didt  give compiler error?)
        long number7 = 100;

        long number8 = 2147483648L;

        double number9 = 3.2568;

        char letter1 = 'q';

        char letter2 = 'A';

        char letter3 = 93;
        int number10 = 93;

//        System.out.println(letter3);
//        System.out.println(number10);

        byte one = -12;
        byte two = 32;
//         byte three = one + two;

        char letter4 = 0;

        boolean man = true;
        boolean married = false;

        // example of using variables
        // create a variable call tax, value is 0.15
        // use this value, calculate how much these employees get after tax
        // john 10000, watson 7000, mike 12000

        double tax = 0.12;

        double johnSalary = 10000 - (10000 * tax);
        double watsonSalary = 7000 - (7000 * tax);
        double mikeSalary = 12000 - (12000 * tax);

        System.out.println(johnSalary);
        System.out.println(watsonSalary);
        System.out.println(mikeSalary);

        int numberOfEmployee = 10;

        // This is Java rule that we have to OBEY.

        int thisIsJavaRuleThatWeHaveToObey;
        //
        //


    }
}
