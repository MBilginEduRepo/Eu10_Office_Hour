package week13;

public class MethodOverriding extends Movies {

    Movies matrix1 = new Movies("matrix1","Action","John");


    public MethodOverriding(String name, String type, String director) {
        super(name, type, director);
    }

    public void play(){
        System.out.println("This movie is directed by " + director);
//        genre = "horor";
    }


}
