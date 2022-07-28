public class Blackjack {
    public static int parseCard(String card) {

        switch (card) {
            case "ace":
                return 11;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;
            default:
                return 0;
        }
    }

    public static boolean isBlackJack(String card1, String card2) {
        if (card1.equals("king") && card2.equals("ace")) {
            System.out.println("Is Blackjack!");
            return true;
        } else {
            System.out.println("Not Blackjack");
            return false;
        }
    }

    public static String largeHand(boolean isBlackjack, int dealerScore) {
        int handScore = 21;
        if (handScore > 20 && isBlackjack && dealerScore < 21) {
            return "W";
        } else {
            return "P";
        }
    }

    public static String smallHand(int handScore, int dealerScore) {
        if (handScore < 21 && handScore > dealerScore) {
            return "H";
        } else {
            return "S";
        }
    }

//  FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
//  This function is already implemented and does not need to be edited. It pulls the other functions together in a
//  complete decision tree for the first turn.

    public static String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackJack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}




