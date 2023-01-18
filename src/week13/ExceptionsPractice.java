package week13;

public class ExceptionsPractice {

    public static void main(String[] args) {
//        method1();
//        method2();
        method4();
    }

    public static void method1(){
        try{
            System.out.println(10/0);

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (NullPointerException d){
            System.out.println(d.toString());
        }finally {
            System.out.println("This is finally block, it will happen anyway");
        }

    }

    public static void  method2(){


        try {

            String str = null;
            System.out.println(str.toLowerCase());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

//        System.out.println(2.0/0);
    }

    public static void method3() throws InterruptedException {
        Thread.sleep(1000);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e.toString());
        }
    }

    public static void method4() throws ArithmeticException{
        System.out.println(10/0);
    }


}
