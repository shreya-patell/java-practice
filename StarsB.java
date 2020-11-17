package com.company;

public class StarsB {

    public static void main(String[] args) {
        final int MAX_ROWS=10;
        for(int row=0; row<MAX_ROWS; row++){
            for(int space=(MAX_ROWS-row); space>=0; space--){ //prints (10-row #) amount of spaces
                System.out.print(" ");              //prints the spaces
            }
            for(int star=0; star<=row; star++)      //prints the stars
                System.out.print("*");
            System.out.println();
        }
    }
}