package com.company;

import java.util.*;

public class  Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game called Odds and Evens");
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String choosing = input.next();
        if (choosing.equals("O")) {
            System.out.println(name + " has picked odds!. Computer will be evens!");
        } else {
            System.out.println(name + " has picked evens!. Computer will be odds!");
        }
        System.out.println("-------------------------------------------");
        System.out.print("How many \"fingers\" do you put out? ");
        int fingers = input.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\"");
        System.out.println("-------------------------------------------");

        int sum = fingers + computer;
        System.out.println(fingers + " + " + computer + " = " + sum);
        boolean oddOrEven = sum % 2 == 0;
        if (oddOrEven == true) {
            System.out.println(sum + " is.... even");
        }
        else {
            System.out.println(sum + " is odd");
        }
        boolean user = fingers%2==0;

        if (oddOrEven == true){
            if (user == true ){
                System.out.println("That means " + name + " wins! :)");
            }
            else {
                System.out.println("That means computer wins!");
            }
        }
        else {
            if (oddOrEven == false){
                if (user == false){
                    System.out.println("That means " + name + " wins!");
                }
                else{
                    System.out.println("That means computer wins! ");
                }
            }
        }
    }
}
