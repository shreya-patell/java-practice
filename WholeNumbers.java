package com.company;

import java.util.Scanner;

public class WholeNumbers {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a floating point number: ");
        double amount = input.nextDouble(); //user inputs a floating number
        System.out.println("First closest integer to " + amount + " is " + (int)amount); //lower integer
        System.out.println("Second closest integer to " + amount + " is " + ((int)amount+1)); //higher integer
    }
}