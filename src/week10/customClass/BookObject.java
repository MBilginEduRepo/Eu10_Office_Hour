package week10.customClass;

public class BookObject {

    public static void main(String[] args) {

        Books sapiens = new Books();

        sapiens.getInfo();
        sapiens.setBook("Sapiens","Harrari",2015,"History");
        sapiens.getInfo();

        System.out.println("**********************************************");
        Books howGoogleWorks = new Books();
        howGoogleWorks.setBook("How Google Works", "Eric", 2016,"Business");
        howGoogleWorks.getInfo();


//        System.out.println(sapiens);
        System.out.println("*************************");

        Products p1 = new Products();
        System.out.println(p1.name);
        System.out.println(p1.price);
        System.out.println(p1.quantity);

        p1.setName();
        System.out.println(p1.name);

    }
}
