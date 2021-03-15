package Objects_Class;

import java.util.*;

class Cards {
    int value;
    String suit;

    public void setCards(String suit, int r) {
        this.value = r;
        this.suit = suit;
    }

     int getSuitPriority(String suitString) {
        int getSuitPriority = 0;
        switch (suitString) {
            case "spades" :
                getSuitPriority =  4;
                break;

            case "diamonds" :
                getSuitPriority =  3;
            break;

            case "hearts" :
                getSuitPriority =  2;
            break;

            case "clubs" :
                getSuitPriority = 1;
            break;
        }
        return getSuitPriority;

    }


}

class ClassicGame {
    int points1 = 0;
    int points2 = 0;

    public void game(Cards c1, Cards c2) {

        int suitValueCard1 = 0;
        int suitValueCard2 = 0;


        if (c1.value == c2.value) {
            suitValueCard1 = c1.getSuitPriority(c1.suit);
            suitValueCard2 = c1.getSuitPriority(c1.suit);
            if (suitValueCard1 > suitValueCard2) {
                points1++;
            }
            else {
                points2++;
            }
        }
        else if (c1.value > c2.value){
            points1++;
        }
        else {
            points2++;
        }

        System.out.println("points of player 1 :" + " " + points1);
        System.out.println("points of player 2 :" + " " + points2);
    }

}

public class Rummy {

    public static void main(String[] args) {
        //Two objects (cards) of class Cards
        Cards c1 = new Cards();
        Cards c2 = new Cards();
        Scanner in = new Scanner(System.in);
        //Enter the suit of card 1
        String s1 = in.nextLine();
        c1.setCards(s1, in.nextInt());
        in.nextLine();
        //Enter the suit of card 2
        String s2 = in.nextLine();
        c2.setCards(s2, in.nextInt());
        ClassicGame c = new ClassicGame();

        c.game(c1, c2);
    }
}