package com.company;

public class StarsA {
    public static void main(String[] args) {
        final int MAX_ROWS = 10; //the number of rows
        for(int row=MAX_ROWS; row>=0; row--){ //goes to the next line
            for(int star=row; star>=0; star--) 
                System.out.print("*");
            System.out.println();
        }
    }
}
