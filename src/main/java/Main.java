public class Main {
    public static void main(String[] args) {
        Card ace = new Card("Hearts", "Ace");
        Card king = new Card("Spades", "King");
        Card ten = new Card("Diamonds", "10");

        System.out.println(ace);
        System.out.println(king);
        System.out.println(ten);

        System.out.println("Ace is worth: " + ace.getPointValue());
        System.out.println("King is worth: "+ king.getPointValue());
        System.out.println("10 is worth: " + ten.getPointValue());
    }
}
