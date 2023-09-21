package class19;
public class Degree {

    public void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}
class BS extends Degree {

    public void getPrequisite() {
        System.out.println("After earning high school diploma is Bachelor's Degree");
    }
}

class Masters extends Degree{
    public void getPrequisite() {
        System.out.println("After earning your Bachelor's is a Master's Degree");
    }

    public static void main(String[] args) {
        Masters obj = new Masters();
        BS obj2 = new BS();
        Degree obj3 = new Degree();

        obj3.getPrerequisite();
        obj2.getPrequisite();
        obj.getPrequisite();
    }

}
