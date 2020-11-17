package com.company;
import java.util.Random;

public class CardDriver {
    public static void main (String [] args) {
        DeckOfCards deck = new DeckOfCards(); //initialising an entire deck
        DeckOfCards subdeck = new DeckOfCards(5); //initializing 5 cards from the entire deck
        System.out.println("Cards Dealt in this Hand: ");
        //choosing a random deck with 5 cards
        Card [] deckwfive = deck.getCardDeck();
        Card [] randomDeck = new Card[5];
        for (int i = 0; i < 5; i++) {
            double rcard = Math.random(); //choosing random card
            Card random = deckwfive[(int) Math.round(rcard*52)]; ///initilizing a random card out the 52 and setting it in randomdeck
            randomDeck[i] = new Card("", "");
            randomDeck[i].setBoth(random.getFaceValue(), random.getSuit());
            System.out.println(randomDeck[i].getFaceValue() + " of " + randomDeck[i].getSuit());
        }
        subdeck.setSubDeck(randomDeck);
        subdeck.printSuitHist();
        System.out.println("Hand Score is: " + subdeck.handScore());
        System.out.println("This hand is a flush?: " + subdeck.hasFlush());
    }
}
