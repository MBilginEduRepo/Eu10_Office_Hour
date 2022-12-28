package week10.constructors;

public class HouseObject {

    public static void main(String[] args) {
//        House house = new House();
//        house.address = "chicago";
//        house.year = 1980;
//        house.type = "mansion";

        House house1 = new House("New York");
        System.out.println(house1.address);


        House house2 = new House("Chicago", 2009);
        System.out.println(house2.year);
        System.out.println(house2.address);


    }



}
