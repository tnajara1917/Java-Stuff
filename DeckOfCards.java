//Deck of Cards by Tyler Najara
public class deckofcards {
    
    public static void main(String[] args) {
        
        int card = (int) (Math.random()*52); //deck of cards
        int rank = card/4;     //seperating ranks
        int suit = card&4;     //seperating suits
        String stRank = "";
        String stSuit = "";
        
        switch(rank){      //switch statement to determine rank
            case 0:
                stRank = "Ace"; break;
            case 10:
                stRank = "Jack"; break;
            case 11:
                stRank = "Queen"; break;
            case 12:
                stRank = "King"; break;
            default:
                stRank = "" + (rank + 1); break;
        }
        switch(suit){     //switch statement to determine suit
            case 0:
                stSuit = "Clubs"; break;
            case 1:
                stSuit = "Diamonds"; break;
            case 2:
                stSuit = "Hearts"; break;
            case 3:
                stSuit = "Spades"; break;
        }
        System.out.println("The card picked was " + stRank + " of " + stSuit);
    }
}
