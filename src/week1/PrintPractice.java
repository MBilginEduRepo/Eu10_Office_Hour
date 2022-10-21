package week1;

public class PrintPractice {

    public static void main(String[] args) {
//        System.out.println("This is our first office hour");
//        System.out.println("This is second line");
//        System.out.print("let it be at same line");
//        System.out.println("one more line");
//
//        System.out.println("type anything");

        // this code has some problem, I will fix it later.

        /*
        this is a command
        and it is multiple line command
         */

//         this is another comment
        // ctrl + / is shortcut for making comment line
        //System.out.println(123); // I dont accept this
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.print(1);
//        System.out.print(2);
//        System.out.print(3);

//        printTwinkle();
//        printStars();
//        printReceipt();
//        printNumsTree();
        printSmilyFace();
    }

    public static void pirnt1() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.print(1);
        System.out.print(2);
        System.out.print(3);

    }

    public static void printTwinkle() {
        System.out.println("Twinkle, twinkle, little star,\n\tHow I wonder what you are!\n\t\tUp above the world so high,\n\t\tLike a diamond in the sky.\nTwinkle, twinkle, little star,\n\tHow I wonder what you are");
        System.out.println("**********");
        System.out.println("\t*");
    /*
Twinkle, twinkle, little star,
	How I wonder what you are!
		Up above the world so high,
		Like a diamond in the sky.
Twinkle, twinkle, little star,
	How I wonder what you are
	\n \t

     */

        /*

         *****
         ****
         ***
         **
         *
         **
         ***
         ****
         *****

         */


    }
    public static void printStars() {
        System.out.println("*****\n****\n***\n**\n*\n**\n***\n****\n*****");
    }
    public static void printReceipt(){
        System.out.println("------------------\n|Date: 19.10.2022|\n|Table No.:    06|\n|                |\n|Item       Price|\n|Water          2|\n|Coffee        12|\n|Tea            8|\n|Total         22|\n------------------");
        System.out.println("------------------\n|Date: 19.10.2022|\n|Table No.:    06|\n|                |\n|Item       Price|\n|Water          2|\n|Coffee        12|\n" +
                "|Tea            8|\n|Total         22|\n------------------");
        System.out.println("------------------\n|Date: 19.10.2022|\n|Table No.:    06|\n|                |\n" +
                "|Item       Price|\n|Water          2|\n|Coffee        12|\n|Tea            8|\n|Total         22|\n------------------");

        System.out.println("------------------");
        System.out.println("|Date: 19.10.2022|");
        System.out.println("|Table No.:    06|");
        System.out.println("|                |");
        System.out.println("|Item       Price|");
        System.out.println("|Water          2|");
        System.out.println("|Coffee        12|");
        System.out.println("|Tea            8|");
        System.out.println("|Total         22|");
        System.out.println("------------------");

        /*
------------------
|Date: 19.10.2022|
|Table No.:    06|
|                |
|Item       Price|
|Water          2|
|Coffee        12|
|Tea            8|
|Total         22|
------------------
         */
    }
    public static void printNumsTree(){
        System.out.println("      10");
        System.out.println("     / \\");
        System.out.println( "  20    30");
        System.out.println("  / \\");
        System.out.println(" 40  50");


        /*

    10
   / \
  20   30
 / \
40   50
         */
    }
    public static void printSmilyFace(){
           /*

""	""
  \/
         */
        System.out.println("\"\"    \"\"");
        System.out.println("   \\/");
        }






}