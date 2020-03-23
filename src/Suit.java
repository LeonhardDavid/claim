public enum Suit {
  HEARTS("Hearts"),   // inima
  SPADES("Spades"),   // frunza
  DIAMONDS("Diamonds"), // romb
  CLUBS("Clubs");    // cruce

  private final String suitText;

  //constructor
  Suit(String suitText){
    this.suitText = suitText;
  }

  //public methods
  public String printSuit(){
    return suitText;
  }
}
