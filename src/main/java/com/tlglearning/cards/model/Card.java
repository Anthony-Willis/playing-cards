package com.tlglearning.cards.model;
//FIELDS, CONSTRUCTORS, METHODS
public class Card {
//fields
  private final Rank rank;//each instance will have its own rank and suit. So it is NOT static final
  private final Suit suit;
//constructor
  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }
//accessors(getter, but not using get this time)
  public Rank rank() {
    return rank;
  }
  
  public Suit suit() {
    return suit;
  }

  @Override
  public String toString() {
    return rank.symbol() + suit.symbol();
  }

  // TODO: 9/13/2022 override equals method 
  // TODO: 9/13/2022 override hashcode method 
}
