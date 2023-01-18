package week13;

public class Movies {

    String name;
    String type;
    String director;

    public Movies(String name, String type, String director) {
        this.name = name;
        this.type = type;
        this.director = director;
    }

    public void play(){
        System.out.println("Now playing " + name);
    }

    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
}
