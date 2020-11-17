package com.company;

public class DeckOfCards {
    private int n;
    private Card[] cardDeck = new Card[52]; //stores an array of 52 objects
    private Card[] subdeck;                 //creates subdeck

    public DeckOfCards() {
        String[] suits = {"\u2660", "\u2663", "\u2666", "\u2665"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int i;
        for (i = 0; i < 12; i++) { //initializes 12 cards
            cardDeck[i] = new Card(ranks[i], suits[0]);
        }
        for (i = 13; i < 25; i++) { //initializes 12 cards
            for (int y = 0; y < 13; y++) {
                cardDeck[i] = new Card(ranks[y], suits[1]);
            }
        }
        for (i = 26; i < 38; i++) { //initializes 12 cards
            for (int y = 0; y < 13; y++) {
                cardDeck[i] = new Card(ranks[y], suits[2]);
            }
        }
        for (i = 38; i < 51; i++) { //initializes 12 cards
            for (int y = 0; y < 13; y++) {
                cardDeck[i] = new Card(ranks[y], suits[3]);
            }
        }
    }
    public Card[] getCardDeck(){
        return cardDeck;
    }

    public DeckOfCards(int n) {
        this.subdeck = new Card[n];
        for (int i = 0; i < n; i++) {
            this.subdeck[i] = new Card("", "");
        }
    }
    public void setSubDeck(Card[] cardDeck) {
        this.subdeck = cardDeck;
    }
    //if the value if greater than 10, value will be stored as 10
    //elseif the value will be of the card itself
    public int handScore() {
        int score = 0;
        for (int i = 0; i < 5; i++) {
            if (this.subdeck[i].getFaceValue().equals("Ace")) {
                score += 1;
            } else if (this.subdeck[i].getFaceValue().equals("2")) {
                score += 2;
            } else if (this.subdeck[i].getFaceValue().equals("3")) {
                score += 3;
            } else if (this.subdeck[i].getFaceValue().equals("4")) {
                score += 4;
            } else if (this.subdeck[i].getFaceValue().equals("5")) {
                score += 5;
            } else if (this.subdeck[i].getFaceValue().equals("6")) {
                score += 6;
            } else if (this.subdeck[i].getFaceValue().equals("7")) {
                score += 7;
            } else if (this.subdeck[i].getFaceValue().equals("8")) {
                score += 8;
            } else if (this.subdeck[i].getFaceValue().equals("9")) {
                score += 9;
            } else {
                score += 10;
            }
        }
        return score;
    }

    public void printSuitHist() {
        int spade = 0;
        int club = 0;
        int diamonds = 0;
        int hearts = 0;
        //counts the frequency of each card in the same deck
        for (int i = 0; i < subdeck.length; i++) {
            if (this.subdeck[i].getSuit().equals("Spade")) {
                spade += 1;
            } else if (this.subdeck[i].getSuit().equals("Club")) {
                club += 1;
            } else if (this.subdeck[i].getSuit().equals("Diamonds")) {
                diamonds += 1;
            } else if (this.subdeck[i].getSuit().equals("Hearts")) {
                hearts += 1;
            }
        }
        // prints the histogram using numbers
        System.out.println("Hearts:" + "\n" + hearts);
        System.out.println("Diamond:" + "\n" + diamonds);
        System.out.println("Spade:" + "\n" + spade);
        System.out.println("Hearts:" + "\n" + hearts);
    }
        public boolean hasFlush(){
            int same = 0;
            String suit = this.subdeck[0].getSuit();
            for (int i = 0; i < 5; i++) {
                if (this.subdeck[i].getSuit().equals(suit)) {   //compares the suits of the 5 cards
                    same += 1;      //increments the counter if they are the same
                }
            }
            if (same >= 5) {        //returns true if the same suit occurs 4 times
                return true;
            } else {
                return false;
            }
        }
    }

