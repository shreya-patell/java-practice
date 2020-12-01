package com.company;
import java.util.Scanner;

public class BaseConversion {

    public static void main (String[] args) {
        int base10Num;
        int base;
        Scanner scan = new Scanner (System.in);
        System.out.println ();
        System.out.println ("Base Conversion Program");
        System.out.print ("Enter an integer: ");
        base10Num = scan.nextInt();
        System.out.print ("Enter the base: ");
        base = scan.nextInt();
        System.out.println("The number " + base10Num + " in base " + base + " is " + convert(base10Num, base));
    }

    // --------------------------------------------------
    //   Converts a base 10 number to another base.
    // --------------------------------------------------
    public static String convert (int number, int b){
        int quotient = number/b;  // the quotient when num is divided by base b
        int remainder = number%b; // the remainder when num is divided by base b
        if (quotient == 0){
            return Integer.toString(remainder);
        }
        else{
            return (convert(quotient, b) + Integer.toString(remainder));
        }
    }
}
