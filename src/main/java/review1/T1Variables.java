package review1;

import org.w3c.dom.ls.LSOutput;

public class T1Variables {
    // Go to amazon choose any product
    // you have to store its variables
    // title price average rating noOfReviews availability

    public static void main(String[] args) {

        String gameName = "MARVEL'S SPIDER-MAN 2";
        String gameEdition = "PS5 Launch Edition";
        String top100 = "Ranked #46";
        double gamePrice = 69.99;
        boolean isAvaiilable = false;
        boolean playstationRanked1 = true;


        System.out.println(gameName + "-" + gameEdition);
        System.out.println(gamePrice);
        System.out.println("" + isAvaiilable);
        System.out.println("Where is the game ranked in the top 100?");
        System.out.println("Answer: " + top100);
        System.out.println("Is the game #1 in Playstation 5 Games?");
        System.out.print("Answer: " + playstationRanked1);

    }


}
