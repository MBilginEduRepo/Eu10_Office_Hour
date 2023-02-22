package week16;

public class Test {

    public static void main(String[] args) {
       TestFunctionalInterface findSquare = (n) -> {
           return n*n;
       };

        System.out.println(findSquare.apply(5));
    }
}
