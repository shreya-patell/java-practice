package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    intro();
    budget ();
    diff();
    area();
        System.out.println("Thank you, have a great trip! ");
    }
    public static void intro(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", " + "where are you travelling? ");
        String place = input.nextLine();
        System.out.println("Great! " + place + " sounds like a great trip");
        System.out.println("****************************");
    }
    public static void budget (){
        Scanner input = new Scanner(System.in);
        System.out.print("How many days will you be travelling for? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning on the trip? ");
        double amount = input.nextInt();
        System.out.print("What is the currency symbol for your travel destination? ");
        String symbol = input.next();
        System.out.print("How many " + symbol + " are there in 1 USD? ");
        double rate = input.nextDouble();
        System.out.println("If you're travelling for " + days + " days, that is the same as " + days*24 + " hours or " + days*24*60 + " minutes");
        double spending = (amount/days);
        double rounded = spending * 100;
        rounded =(int)(rounded);
        rounded = rounded/100.0;
        System.out.println("If you're going to spend $" + amount + " USD that means per day, you can spend up to $ " + rounded + " USD");
        double destination_budget = amount*rate;
        destination_budget = (int)(destination_budget);
        destination_budget = destination_budget/100;
        double per_day = (destination_budget)/days;
        per_day = (int)(per_day);
        per_day = per_day/100;
        System.out.println("Your total budget in " + symbol + " is " + destination_budget + " " + symbol + " which per day is " + per_day + " " + symbol);
        System.out.println("****************************");
    }
    public static void diff(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and the destination? ");
        int hours = input.nextInt();
        int conversion_midnight = (hours + 0)%24;
        int conversion_noon = (hours + 12)%24;
        System.out.println("That means that when it is midnight at home, it will be " + conversion_midnight + ":00 in your travel destination and when it is noon at home it will be " + conversion_noon + ":00");
        System.out.println("****************************");
    }
    public static void area(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the area of the destination country, in km^2? ");
        double kilometers = input.nextInt();
        double miles_0 = kilometers/2.59;
        double miles = miles_0 * 100;
        miles = (int)(miles);
        miles = miles/100;
        System.out.println("In miles^2 that is " + miles);
        System.out.println("****************************");
    }
}
