public class Card {
  private final Rank rank;
  private final Suit suit;
  public boolean isFaceUp;

  // constructor
  public Card(Rank rank1, Suit suit1){
    this.rank = rank1;
    this.suit = suit1;
    isFaceUp = false;
  }

  // public methods
  public String getSuit(){
    return suit.printSuit();
  }

  public int getRank(){
    return rank.getRank();
  }

  public String printRank(){
    return rank.printRank();
  }

  public void flipCard(){
    isFaceUp = !isFaceUp;
  }

  public String toString(){
    String str = "";
    if(isFaceUp){
      str += rank.printRank() + " of " + suit.printSuit();
    }else{
      str += "Face Down";
    }
    return str;
  }


}
