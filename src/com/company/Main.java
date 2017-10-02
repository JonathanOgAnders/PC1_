package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Deck deck = new Deck();
        deck.setCardValues(0);

        Deck.Card card1 = deck.drawOneCard();
        Deck.Card card2 = deck.drawOneCard();
        System.out.println(card1 + " " + card2);
        System.out.println(card1.compareTo(card2));

    }
}
