package week11.staticPractice;

public class StaticObjects {

    static StaticPractice sp = new StaticPractice();
    static StaticPractice sp1 = new StaticPractice();
    static StaticPractice sp2 = new StaticPractice();
    static StaticPractice sp3 = new StaticPractice();


    public static void main(String[] args) {
        System.out.println(sp.a);
        System.out.println(sp.b);

        System.out.println(StaticPractice.a);
        StaticPractice.method2();

        sp.method1();
        sp.method2();

    }
}
