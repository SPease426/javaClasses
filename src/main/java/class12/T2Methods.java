package class12;

public class T2Methods {

    int getLarger(int num1,int num2){
        int res;
        if(num1>num2){
            res=num1;
        }

        else{
            res=num2;
        }

        return res;
    }

    String createEmail(String firstName, String lastName, String emailName){
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        emailName = emailName.toLowerCase();


        String emailAddr = firstName + lastName + "@" + emailName + ".com";
        return emailAddr;
    }
}
