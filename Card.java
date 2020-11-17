package com.company;

public class Card {

    //represents a playing card with face value and suit
    private String faceValue;
    private String suit;

    //constructor
    public Card(String faceValue, String suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }
    //getters for both variables
    public String getFaceValue() {
        return faceValue;
    }
    public String getSuit() {
        return suit;
    }
    //set both variables
    public void setBoth(String faceValue, String suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }
}
