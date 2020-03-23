public class Game {
  public static void main(String[] args){

    Deck d1 = new Deck();
    d1.populate();
    //System.out.println("Deck: " + d1.showHand());
    d1.shuffle();
    /*d1.shuffle();
    d1.shuffle();
    d1.shuffle();*/
    //System.out.println(d1.showHand());

    //create playing hands and dealer
    Hand h1,h2,h3,dealer;
    h1 = new Hand();
    h2 = new Hand();
    h3 = new Hand();
    dealer = new Hand();
    Hand[] hands = {h1,h2,h3};

    //deal cards to hands
    d1.deal(hands, 3);

    // deal 2 cards to dealer
    d1.deal(dealer,2);

    //show the players' hands
    for(int i=0;i<hands.length;i++){
      hands[i].flipCards();
      System.out.println(hands[i].showHand());
    }

    //fip dealer's first card
    dealer.getCard(0).flipCard();

    //show the dealer's cards
    System.out.println("Dealer's Cards: \n" + dealer.showHand());

  }
}
