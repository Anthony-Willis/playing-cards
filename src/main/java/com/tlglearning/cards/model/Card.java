package com.tlglearning.cards.model;

import java.util.Objects;

//FIELDS, CONSTRUCTORS, METHODS
public class Card implements Comparable<Card> {

  //fields
  private final Rank rank;//each instance will have its own rank and suit. So it is NOT static final
  private final Suit suit;

  //constructors, special methods that get called when the client says "new"
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
  public int hashCode() {
    return Objects.hash(rank, suit);//// FIXME: 9/16/2022 move this to initialization.
  }

  @Override
  public boolean equals(Object obj) {
    boolean result;
    if (this == obj) {
      result = true;
    } else if (obj instanceof Card) {
      Card other = (Card) obj;
      result = (this.rank == other.rank && this.suit == other.suit);
    } else {
      result = false;
    }
    return result;
  }

  @Override
  public int compareTo(Card other) {
    return 0;
  }

  @Override
  public String toString() {
    return rank.symbol() + suit.symbol();
  }
// TODO: 9/13/2022 override equals method
  // TODO: 9/13/2022 override hashcode method
}
