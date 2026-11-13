package OG;

public class Card {
    private String suit;
    private String rank;
    private int pointValue;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        this.pointValue = calculatePointValue(rank);
    }
    private int calculatePointValue(String rank) {
        if (rank.equals("Ace")) {
            return 11;
        } else if (rank.equals("King") || rank.equals("Queen") || rank.equals("Jack")) {
            return 10;
        } else {
            return Integer.parseInt(rank);
        }
    }

    public int getPointValue() {
        return pointValue;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
