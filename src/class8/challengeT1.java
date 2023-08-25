package class8;

public class challengeT1 {
    public static void main(String[] args) {

        boolean[] conds = {true,false,true,false,true,true};
                int numTrue =0;

        for (int i = 0; i < conds.length; i++) {

            if (conds[i]) {
                numTrue++;
            }

        }

        System.out.println(numTrue);
    }
}
