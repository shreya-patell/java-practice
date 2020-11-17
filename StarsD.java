package com.company;

public class StarsD {

    public static void main(String[] args) {
        final int MAX_ROWS=10;
        for(int row=0; row<MAX_ROWS/2; row++){
            for(int space=1; space<=(MAX_ROWS/2)-row; space++){ //prints the spaces in descending order
                System.out.print(" ");
            }
            for(int star=1;star<=2*row-1;star++)                //prints the stars
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("*********");
        for(int row=(MAX_ROWS/2); row>0; row--){
            for(int space=1; space<=(MAX_ROWS/2)-row; space++) { //prints spaces in a increasing order
                System.out.print(" ");
            }
            for(int star=1; star<=2*row-1; star++) {             //prints the stars
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}