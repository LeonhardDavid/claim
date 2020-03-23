import java.util.Random;

public class Deck extends Hand {
  Random rand = new Random();

  public void populate(){
    for(Suit suit: Suit.values()){
      for(Rank rank: Rank.values()){
        Card card = new Card(rank, suit);
        //card.flipCard(); // should not be flipped
        this.add(card);
      }
    }
  }

  // shuffling could be better
  public void shuffle(){
    for(int i=this.getSize()-1; i>0; i--){
      // swap random card between beginning and last card
      int pick = rand.nextInt(i);
      Card randCard = this.getCard(pick);
      Card lastCard = this.getCard(i);
      this.setCard(pick,this.setCard(i,randCard));
    }
  }

  public void deal(Hand[] hands, int perHand){
    for(int i=0; i<perHand;i++){
      for (Hand hand : hands) {
        this.give(this.getCard(0), hand);
      }
    }
  }

  // deal to a single hand
  public void deal(Hand hand, int perHand){
    for(int i=0;i<perHand;i++){
      this.give(this.getCard(0),hand);
    }
  }

  public void flipCard(Card c){
    c.flipCard();
  }
}
