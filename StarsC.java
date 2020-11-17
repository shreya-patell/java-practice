package com.company;

public class StarsC{

    public static void main(String[] args) {
        final int MAX_ROWS=10;
        for(int row=0; row<MAX_ROWS; row++){
            for(int space=0;space<row;space++){
                System.out.print(" "); //prints the spaces
            }
            for(int star=row;star<MAX_ROWS;star++){ //prints the stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}