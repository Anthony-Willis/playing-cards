package com.tlglearning.cards.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Deck  implements Iterable<Card>{
//fields, then ctors, then methods
  private final List<Card> cards;//fields

  //constructor
  public Deck() {
    cards = new ArrayList<>();
    for (Suit suit : Suit.values()){
      for (Rank rank : Rank.values()){
        Card card = new Card(rank, suit);
        cards.add(card);
      }
    }
  }

  @Override
  public Iterator<Card> iterator() {
    return cards.iterator();
  }
}
