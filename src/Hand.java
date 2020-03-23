import java.util.ArrayList;

public class Hand {
  private ArrayList<Card> cards;

  //constructor
  public Hand(){
    cards = new ArrayList<Card>();
  }

  public void clear(){
    cards.clear();
  }

  public void add(Card card){
    cards.add(card);
  }

  public int getSize(){
    return cards.size();
  }

  public Card getCard(int i){
    return cards.get(i);
  }

  public Card setCard(int i, Card card){
    Card aux = cards.remove(i);
    cards.add(i,card);
    return aux;
  }

  public void flipCards(){
    for(Card c:cards){
      c.flipCard();
    }
  }
  public String showHand(){
    // only show total points if ALL cards are face up
    String str = "";
    boolean allFaceUp = true;
    for(Card c:cards){
      str +=c.toString() + "\n";
      if(!c.isFaceUp){
        allFaceUp = false;
      }
    }
    if(allFaceUp){
      str+="Total points= " + getTotal() + "\n";
    }
    return str;
  }

  public int getTotal(){
    int totalPoints = 0;
    boolean hasAce = false;
    // by default Aces are worth 1
    for(int i=0; i<getSize();i++){
      totalPoints+=getCard(i).getRank();
      //check if card is Ace
      if(getCard(i).printRank().equals("Ace")){
        hasAce = true;
      }
      //Ace is worth 11 if total points <= 11
      if(hasAce && totalPoints<=11){
        totalPoints +=10; // default Ace=1 + 10 => Ace=11
      }
    }
    return totalPoints;
  }

  public boolean give(Card card, Hand otherHand){
    if(!cards.contains(card)){
      return false;
    }else{
      cards.remove(card);
      otherHand.add(card);
      return true;
    }
  }
}
