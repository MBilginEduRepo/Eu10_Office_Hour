package week6;

public class WhilePractices {

    public static void main(String[] args) {
//        one();
//        two();
        three();
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
}
