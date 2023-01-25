package week14.abstraction;

public class SDET extends Course{



    public SDET(String name, String teacher) {
        super(name, teacher);
    }

    @Override
    public void teaching() {
        System.out.println("Muhtar is teaching Java");
    }

    @Override
    public String duration() {
        return "The course lasts 8 months";
    }


}
