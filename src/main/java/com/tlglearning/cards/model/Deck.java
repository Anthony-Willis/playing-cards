package com.tlglearning.cards.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Deck implements Iterable<Card> {

  //fields, then ctors, then methods
  private final List<Card> cards;//fields

  //constructor
  public Deck() {
    cards = new ArrayList<>();
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        Card card = new Card(rank, suit);
        cards.add(card);
      }
    }
  }

  @Override
  public Iterator<Card> iterator() {
    return Collections.unmodifiableCollection(cards).iterator();
  }

  public void shuffle(Random rng) {
    Collections.shuffle(cards, rng);
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  public void sort() {
    sort(null);
  }

  public void sort(Comparator<Card> comparator) {
    cards.sort(comparator);
  }

  @Override
  public int hashCode() {
    return cards.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    boolean result;
    if (this == obj) {
      result = true;
    } else if (obj instanceof Deck) {
      result = cards.equals(((Deck) obj).cards);
    } else {
      result = false;
    }
    return result;
  }

  @Override
  public String toString() {
    return cards.toString();
  }
}


