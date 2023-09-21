package class15;

import class16.Laptop;

public class LaptopDiffPkg extends Laptop {
    protected LaptopDiffPkg(double price) {
        super(price);
    }

    public static void main(String[] args) {

        // new Laptop(); private constructor so it can only be used within the Laptop class in package class 16 only
        // new Laptop("ASUS"); default constructor is only allowed to be used within same package
        new LaptopDiffPkg(7999.99); // protected constructor in Laptop only way to use it is by having a constructor here as well
        new Laptop(5000); // public is public so available to all classes in any package
    }
}
