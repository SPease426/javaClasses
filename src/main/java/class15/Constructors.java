package class15;

public class Constructors {
     private String name;

    public Constructors() {

    }
    public Constructors (String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Constructors empty = new Constructors();
        Constructors me = new Constructors("Shawn");

        System.out.println(empty.name);
        System.out.println(me.name);
    }
}
