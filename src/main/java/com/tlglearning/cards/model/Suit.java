package com.tlglearning.cards.model;

import java.util.Locale;

public enum Suit { //enum is a class

  CLUBS('\u2663', Color.BLACK),// use a \ to type in unicode
  DIAMONDS('\u2662', Color.RED),
  HEARTS('\u2661', Color.RED),
  SPADES('\u2660', Color.BLACK);

  private final char symbol;
  private final Color color;

  Suit(char symbol, Color color) {//constructor does not need to be private, enum constructors default private
    this.symbol = symbol;
    this.color = color;
  }
  public char symbol() {
    return symbol;
  }

  public Color color() {
    return color;
  }

  @Override //@ enlists the compiler to keep us honest, is used during documentation
  public String toString() { //inheriting a method
    String name = name();
    return name.charAt(0) + name.substring(1).toLowerCase(); //taking the 1st letter, then getting the rest, making them all lowercase. + Concatenated together
  }
  public enum Color {
    BLACK, RED
  }
}
