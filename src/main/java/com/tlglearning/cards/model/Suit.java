package com.tlglearning.cards.model;

import java.util.Locale;

public enum Suit { //enum is a class

  CLUBS('\u2663'),// use a \ to type in unicode
  DIAMONDS('\u2662'),
  HEARTS('\u2661'),
  SPADES('\u2660');

  private final char symbol;

  Suit(char symbol) {//constructor does not need to be private, enum constructors default private
    this.symbol = symbol;
  }
  public char symbol() {
    return symbol;
  }

  @Override //@ enlists the compiler to keep us honest, is used during documentation
  public String toString() { //inheriting a method
    String name = name();
    return name.charAt(0) + name.substring(1).toLowerCase(); //taking the 1st letter, then getting the rest, making them all lowercase. + Concatenated together
  }
}
