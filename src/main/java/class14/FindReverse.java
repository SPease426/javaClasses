package class14;

public class FindReverse {
    
    static String reverseString(String str) {
        String newStr = "";

        for (int i = str.length() - 1; i >= 0 ; i--) {
            newStr = newStr + str.charAt(i);
        }

        return newStr;
        
    }
    public static void main(String[] args) {

        System.out.println(reverseString("Hello world"));
        
    }
}
