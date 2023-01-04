package week11.accessModifiers;

public class AccessModifiersObjects {

    public static void main(String[] args) {

        Math.max(1,2);
//        Math math = new Math();
    }

    String s = new String("str");



    public void two(){
        AccessModifiers am = new AccessModifiers();
        System.out.println(am.a);
        System.out.println(am.b);
        System.out.println(am.c);
//        System.out.println(am.d);

        am.one();
        am.three();
        am.four();
//        am.five();
    }



}
