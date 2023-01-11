package week12.inheritance;

public class TranslatorObject {

    public static void main(String[] args) {
        TranslatorAhmet ahmet = new TranslatorAhmet("Ahmet","Arabic","Eygpt");
        System.out.println(ahmet.name);
        System.out.println(ahmet.language);
        System.out.println(ahmet.country);

        TranslatorKim park = new TranslatorKim("Park","korean","South Korea");
        System.out.println(park.country);
        System.out.println(park.name);
        System.out.println(park.language);
    }

       /*
         Why was the java code so well-behaved?
Because it had a strict parent class that it inherited all the rules from.

 Why was the Java code always so tired?
Because it had too many classes to inherit from!

        */
}
