package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class Deck
{
    int cardsInDeck;
    Stack<Card> stack = new Stack<Card>();


    public Deck.Card drawOneCard()
    {
        return stack.pop();
    }

    public Deck()
    {
        for(Suit suit : Suit.values())
        {
            for(Rank value : Rank.values())
            {
                stack.add(new Card(suit,value));
            }
        }
        Collections.shuffle(stack);
    }

    public void setCardValues(int x)
    {
        if(x == 0)
        {
            Rank.ACE.setValue(14);
        }
        else
        {
            Rank.ACE.setValue(1);
        }
    }


    public class Card implements Comparable<Card>
    {

        Suit suit;

        Rank rank;

        public Card(Suit suit, Rank value)
        {
            this.suit = suit;
            this.rank = value;
        }

        @Override //credit AndersK
        public int compareTo(Card o)
        {
            if(rank.getValue() == o.rank.getValue())
            {
                if(suit.getRank() > o.suit.getRank())
                {
                    return 1;
                }
                return -1;
            }
            if(rank.getValue() > o.rank.getValue())
            {
                return 1;
            }
            return -1;
        }

        public String toString()
        {
            return rank + " of " + suit;
        }

    }


}
