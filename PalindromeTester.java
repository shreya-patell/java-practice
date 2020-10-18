package com.company;
import java.util.Scanner;

public class PalindromeTester {

    public static void main(String[] args) {
        String word;
        String option = "y";    //keeps track whether another string needs to be tested
        int left, right;
        Scanner scan = new Scanner(System.in);

        while (option.equalsIgnoreCase("y")){   // allows Y or y
            System.out.print("Enter a word or phrase (without punctuation): ");
            word = scan.nextLine();
            left = 0;   //index of the first character of the string
            right = word.length() - 1;    //index of the last character of the string

            while (word.charAt(left) == word.charAt(right) && left < right){ //compare the first letter from the string to the last letter moving it's way to the middle
                left++;
                right--;
            }
            //checks if the middle of the string is reached
            if (left > right)
                System.out.println("Sorry, that word/phrase is not a palindrome.");
            else
                System.out.println("Yay, that word/phrase is a palindrome.");

            System.out.print("Would you like to test another palindrome (y/n)? ");
            option = scan.nextLine();
        }
    }
}
