package class21;

public class Computer {

    protected String devices;
    protected String OPSystem;

    Computer() {

        this.devices = "Unknown";
    }

    public void printInfo() {
        System.out.println(devices);
        System.out.println(OPSystem);
    }

    public void playGames() {
        System.out.println("Depends on the specs of the laptop");
    }

    public void haveGraphics() {
        System.out.println("Not every computer has a Graphics Cards installed");
    }
}

class Apple extends Computer {

    Apple() {
        super();
        OPSystem = "Apple computers run on a mac Operating System";

    }

    public void printInfo() {
        System.out.println("Apple:");
        System.out.println(devices);
        System.out.println(OPSystem);
    }

    public void playGames() {
        System.out.println("Wouldn't trust playing games on an Apple product");
    }

    public void haveGraphics() {
        System.out.println("I believe Apple products don't have Graphics Cards");
    }

}

class Lenovo extends Computer {

    Lenovo() {
        devices = "Lenovo";
        OPSystem = "Lenovo computers run on a Windows Operating System";
    }

    public void printInfo() {
        System.out.println("Lenovo:");
        System.out.println(devices);
        System.out.println(OPSystem);
    }

    public void playGames() {
        System.out.println("Lenovo is a known gaming laptop product");
        System.out.println("Steam also recommends the Operating System is Windows and Lenovo satisfies that condition to play games");
    }

}

class HP extends Computer {
    HP() {
        super();
        OPSystem = "HP computers run on a Windows Operating System";
    }

    public void printInfo() {
        System.out.println("HP:");
        System.out.println(devices);
        System.out.println(OPSystem);
    }

    public void playGames() {
        System.out.println("HP Devices is not a considered a gaming laptop");
    }

    public void haveGraphics() {
        System.out.println("I believe HP products don't have Graphics Cards");
    }
}

class Dell extends Computer {

    Dell() {
        super();
        OPSystem = "Dell computers run on a Windows Operating System";
    }

    Dell(String brand) {
        OPSystem = "Dell computers run on a Windows Operating System";
        this.devices = brand;
    }

    public void printInfo() {
        System.out.println("Dell:");
        System.out.println(devices);
        System.out.println(OPSystem);
    }

    public void playGames() {

        if (devices.equalsIgnoreCase("Alienware")) {
            System.out.println(devices + " is a known gaming laptop product");
            System.out.println("Steam also recommends the Operating System is Windows and Dell satisfies that condition to play games");
        }
        else {
            System.out.println("Not a popular laptop known to play games");
        }
    }

    public void haveGraphics() {
        System.out.println("I believe Alienware Dell products have Graphics Cards");
    }

}
