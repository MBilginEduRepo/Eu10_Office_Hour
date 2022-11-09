package week4;

public class SwitchStatement {

    public static void main(String[] args) {

        int num = 1;

        switch (num) {
            case 1:
                System.out.println("action 1");
                break;
            case 2:
                System.out.println("action 2");
                break;
//            default:
//                System.out.println("default action");
        }

        /*
        use switch, provide different phone brands
        according to them, print message that buy that brand
        example of string
         */

        String brand = "Samsung";

        switch (brand){
            case "Apple":
                System.out.println("buy an Iphone");
                break;

            case "Samsung":
                System.out.println("Buy a samsung");
                break;

            case "Motorolla":
                System.out.println("Buy a motorolla ");
                break;

            default:
                System.out.println("please enter different phone brand");
        }

         /*
        use switch, provide order number, then print msg that calling by that order num
        example of integers
         */

        int orderNum = 120;

        switch (orderNum){
            case 119:
                System.out.println("order 119 is ready");
                break;
            case 120:
                System.out.println("order 120 is ready");
                break;
            case 121:
                System.out.println("order 121 is ready");
                break;
            default:
                System.out.println("Please wait for your order");
        }

    }
}
