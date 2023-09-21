package class18;

public class userInfo extends User {
    private String address;

    public userInfo (String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    void userDetails() {
        System.out.println("User's name is " + name);
        System.out.print(name + "'s number is " + phoneNumber);
        System.out.println(" and his address is " + address);
    }

    public static void main(String[] args) {
        userInfo obj = new userInfo("Tim","(661)543-4932", "4543 Nordhoff St. West");
        obj.userDetails();
    }

}
