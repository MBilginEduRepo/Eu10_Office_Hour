package week5;

public class StringPractice {

    public static void main(String[] args) {

//        String s1 = "hat";
//        String s2 = new String("hat");
//
//        System.out.println(s1.equals(s2));

//        System.out.println(s1 == s2);
//
//        String s3 = "hat";
//        System.out.println(s1 == s3);
//
//        s3 = "bag";
//
//        System.out.println(s3);

//checkLength();
//        trimMethod();
//indexMethod();
        substringMethod();

    }

    public static void checkLength(){
        System.out.println("house".charAt(0));
        System.out.println("How much is the_lenght of this **** statement?".length());
    }

    public static void trimMethod(){
        System.out.println(" This is a .trim method, practice . ".trim());
        System.out.println(" This is a .trim method, practice . ".replace(" ", ""));
    }

    public static void indexMethod(){
        String data = "Hello, World";
        System.out.println(data.indexOf('o'));
        System.out.println(data.lastIndexOf("o"));
        char o = 'o';
        String o1 = "o";

    }
    public static void substringMethod(){
        String data = "This is substring practice";
        String subData1 = data.substring(5);
        String subData2 = data.substring(5,10); // not including ending index
        System.out.println(subData1);
        System.out.println(subData2);
        System.out.println(data.repeat(3));
    }


}
